package Service;

import Dao.DaoUtil.SqlUtil;
import Dao.RepositoryImpl.TeachingClassRepositoryImpl;
import Dao.RepositoryImpl.TimeTableRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "IntituteServlet",urlPatterns = "/index")
public class IntituteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type","text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        Connection connection = null;
        try {
            connection = new SqlUtil().getConnection();
            TeachingClassRepositoryImpl teachingClassRepository = new TeachingClassRepositoryImpl(connection);
            TimeTableRepositoryImpl timeTableRepository = new TimeTableRepositoryImpl(connection);
            List<String> instituteList = teachingClassRepository.selectInstitute();
            List<String> teacherList = timeTableRepository.findAllTeacher();
            List<String> classList = timeTableRepository.findAllClass();
            request.setAttribute("instituteList",instituteList);
            request.setAttribute("teacherList",teacherList);
            request.setAttribute("classList",classList);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/ajaxTest.jsp");
            dispatcher.forward(request, response);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
