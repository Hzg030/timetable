package Service;

import Dao.DaoUtil.SqlUtil;
import Dao.Entity.FinalTimeTable;
import Dao.RepositoryImpl.TimeTableRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "TimeTableServlet",urlPatterns = "/getTimeTable")
public class TimeTableServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type","text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        Connection connection = null;
        try {
            connection = new SqlUtil().getConnection();
            TimeTableRepositoryImpl timeTableRepository = new TimeTableRepositoryImpl(connection);
            String type = request.getParameter("type");
            List<FinalTimeTable> list = new ArrayList<>();
            if(type.equals("teacher")){
                list = timeTableRepository.selectByTeacherName(request.getParameter("name"));
            }else {
                list = timeTableRepository.selectByCLassName(request.getParameter("name"));
            }


            PrintWriter writer = response.getWriter();
            writer.println("<table class=\"table table-condensed\" width=\"95%\" border=\"1\" cellpadding=\"2\" cellspacing=\"1\" style=\"table-layout:fixed;\">\n" +
                    "                <thead>\n" +
                    "                <tr>\n" +
                    "                    <th class=\"text-left\" style=\"width: 186px;\">\n" +
                    "                    </th>\n" +
                    "                    <th class=\"text-left\" style=\"width: 186px;\">\n" +
                    "                        周一\n" +
                    "                    </th>\n" +
                    "                    <th class=\"text-left\" style=\"width: 186px;\">\n" +
                    "                        周二\n" +
                    "                    </th>\n" +
                    "                    <th class=\"text-left\" style=\"width: 186px;\">\n" +
                    "                        周三\n" +
                    "                    </th>\n" +
                    "                    <th class=\"text-left\" style=\"width: 186px;\">\n" +
                    "                        周四\n" +
                    "                    </th>\n" +
                    "                    <th class=\"text-left\" style=\"width: 186px;\">\n" +
                    "                        周五\n" +
                    "                    </th>\n" +
                    "                </tr>\n" +
                    "                </thead>\n" +
                    "                <tbody>");

            for (int i = 0; i < 5; i++) {
                writer.println("<tr><td>"+(i+1)+"</td>");
                for (int j = 0; j < 5; j++) {
                    writer.println("<td>");
                    for (FinalTimeTable f:list) {
                        if(f.getDay()==i&&f.getTime()==j){
                            writer.println("<br><a href=\"#\" class=\"tooltip-test\" title=\"任课老师："+f.getTeacherName()+"|课程名称："
                                    +f.getCourseName()+"|上课地点："+f.getBuildingName()+f.getRoomNumber()+
                                    "\" data-toggle=\"tooltip\" >"+f.getTeacherName()+"|"+f.getCourseName()+"</a>");
                        }
                    }
                    writer.println("</td>");
                }
                writer.println("</tr>");
            }

            writer.println(" </tbody>\n" +
                    "            </table>");
            writer.println("<script>\n" +
                    "\t$(function () { $(\"[data-toggle='tooltip']\").tooltip(); });\n" +
                    "</script>");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
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
