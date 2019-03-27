package Service;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "TestServlet",urlPatterns = {"/test"})
public class TestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().print(request.getParameter("q"));
    }
}
