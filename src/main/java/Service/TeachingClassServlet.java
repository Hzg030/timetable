package Service;

import Dao.Entity.TeachingClass;
import Dao.RepositoryImpl.TeachingClassRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TeachingClassServlet",urlPatterns = "/getAllTeachingClass")
public class TeachingClassServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TeachingClassRepositoryImpl teachingClassRepository = new TeachingClassRepositoryImpl();
        List<TeachingClass> list = teachingClassRepository.selectAll();
        request.setAttribute("TeachingClassList",list);
    }
}
