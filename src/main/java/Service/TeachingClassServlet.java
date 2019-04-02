package Service;

import Dao.DaoUtil.SqlUtil;
import Dao.Entity.FinalTeachingClass;
import Dao.Entity.PageBean;
import Dao.Entity.TeachingClass;
import Dao.Repository.Repository;
import Dao.RepositoryImpl.TeachingClassRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "TeachingClassServlet",urlPatterns = "/getAllTeachingClass")
public class TeachingClassServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection connection = null;
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type","text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");


        try {
            connection = new SqlUtil().getConnection();
            TeachingClassRepositoryImpl teachingClassRepository = new TeachingClassRepositoryImpl(connection);
            int currentPage =  1;
            if(request.getParameter("currentPage")!=null){
                currentPage = Integer.parseInt(request.getParameter("currentPage"));
            }
            String institute = request.getParameter("institute");
//            institute = new String(institute.getBytes("iso8859-1"),"utf-8");

            List<FinalTeachingClass> list = teachingClassRepository.findArticleByPage(currentPage,institute);
            PageBean<FinalTeachingClass> pageBean = new PageBean<>();

            int pageSize = Repository.PAGE_SIZE ;
            pageBean.setCurrentPage(currentPage); //设置当前页
            pageBean.setPageSize(pageSize); //设置每页显示多少记录
            pageBean.setList(list); //设置这一页的失物数据

            //总的记录数， 总的页数。
            int count = teachingClassRepository.findCount(institute);
            //System.out.println(count);
            pageBean.setTotalSize(count); //设置总的记录数
            pageBean.setTotalPage(count % pageSize==0 ? count / pageSize : (count / pageSize) + 1); //总页数



            PrintWriter writer = response.getWriter();
            writer.println("<table class=\"table table-hover\" >\n" +
                    "                <thead>\n" +
                    "                <tr>\n" +
                    "                    <th>\n" +
                    "                        教学班编号\n" +
                    "                    </th>\n" +
                    "                    <th>\n" +
                    "                        教学班名称\n" +
                    "                    </th>\n" +
                    "                    <th>\n" +
                    "                        任课老师Id\n" +
                    "                    </th>\n" +
                    "                    <th>\n" +
                    "                        任课老师\n" +
                    "                    </th>\n" +
                    "                    <th>\n" +
                    "                        容量\n" +
                    "                    </th>\n" +
                    "                    <th>\n" +
                    "                        总周数\n" +
                    "                    </th>\n" +
                    "                    <th>\n" +
                    "                        上课周次\n" +
                    "                    </th>\n" +
                    "                    <th>\n" +
                    "                        上课时间\n" +
                    "                    </th>\n" +
                    "                    <th>\n" +
                    "                        上课节数\n" +
                    "                    </th>\n" +
                    "                    <th>\n" +
                    "                        上课地点\n" +
                    "                    </th>\n" +
                    "                    <th>\n" +
                    "                        操作\n" +
                    "                    </th>\n" +
                    "                </tr>\n" +
                    "                </thead>\n" +
                    "                <tbody>");
            for (FinalTeachingClass f: list){
                writer.println("<tr class=\"info\">\n" +
                        "                    <td>\n" +
                        f.getTeachingClassId()+"\n" +
                        "                    </td>\n" +
                        "                    <td>\n" +
                        f.getClassName()+"\n" +
                        "                    </td>\n" +
                        "                    <td>\n" +
                        f.getTeacherId()+"\n" +
                        "                    </td>\n" +
                        "                    <td>\n" +
                        f.getTeacherName()+"\n" +
                        "                    </td>\n" +
                        "                    <td>\n" +
                        f.getNumber()+"\n" +
                        "                    </td>\n" +
                        "                    <td>\n" +
                        f.getTotalCount()+"\n" +
                        "                    </td>\n" +
                        "                    <td>\n" +
                        f.getTotalCount()+"\n" +
                        "                    </td>\n" +
                        "                    <td>\n" +
                        f.getTotalCount()+"\n" +
                        "                    </td>\n" +
                        "                    <td>\n" +
                        f.getTotalCount()+"\n" +
                        "                    </td>\n" +
                        "                    <td>\n" +
                        f.getTotalCount()+"\n" +
                        "                    </td>\n" +
                        "                    <td>\n" +
                        "<input type=\"button\" value=\"提交排课\" id=\"btn\" onclick=\"\">\n" +
                        "                    </td>\n" +
                        "                </tr>");
            }
            writer.println("<tr>\n" +
                    "                    <td colspan=\"6\">\n" +
                    "                        第 "+pageBean.getCurrentPage()+" 页\n" +
                    "                        &nbsp;&nbsp;&nbsp;\n" +
                    "                        每页显示 "+pageBean.getPageSize()+" 条&nbsp;&nbsp;&nbsp;\n" +
                    "                        总的记录数 "+pageBean.getTotalSize()+" 条\n" +
                    "                        &nbsp;&nbsp;&nbsp;\n" );
//                    "                        <c:if test=${\""+pageBean.getCurrentPage()+"!=1}\">\n" ;
            if(pageBean.getCurrentPage()!=1){
                writer.println(
                        "                           <input type=\"button\" value=\"首页\" id=\"btn\" onclick=\"sub(1,\'"+institute+"\')\">"+
    //                    "                            <a href = \"getAllTeachingClass?currentPage=1\">首页</a> |\n" +
                        "                           <input type=\"button\" value=\"上一页\" id=\"btn\" onclick=\"sub("+(pageBean.getCurrentPage()-1)+",\'"+institute+"\')\">"
    //                    "                            <a href = \"getAllTeachingClass?currentPage="+(pageBean.getCurrentPage()-1)+"\">上一页</a>\n" +
    //                    "                        </c:if>\n" +
                );
            }
            for (int i = 1; i <= pageBean.getTotalPage(); i++) {
                if(pageBean.getCurrentPage() == i){
                    writer.println(i);
                }
                if(pageBean.getCurrentPage()!=i){
                    writer.println("<input type=\"button\" value=\""+i+"\" id=\"btn\" onclick=\"sub("+i+",\'"+institute+"\')\">");
                }
            }
//                    "\n" +
//                    "                        <c:forEach begin=\"1\" end=\""+pageBean.getTotalPage()+"\" var=\"i\">\n" +
//                    "                            <c:if test=\"${"+pageBean.getCurrentPage()+" == i }\">\n" +
//                    "                                ${i }\n" +
//                    "                            </c:if>\n" +
//                    "                            <c:if test=\"${"+pageBean.getCurrentPage()+" != i }\">\n" +
//                    "                                <a href=\"getAllTeachingClass?currentPage=${i }\">${i }</a>\n" +
//                    "                            </c:if>\n" +
//                    "                        </c:forEach>\n" +
//                    "\n" +
            if (pageBean.getCurrentPage() != pageBean.getTotalPage()) {
                writer.println(
    //                    "                        <c:if test=\"${"+pageBean.getCurrentPage()+" != "+pageBean.getTotalPage()+" }\">\n" +
    //                    "                            <a href = \"getAllTeachingClass?currentPage="+(pageBean.getCurrentPage()+1)+"\">下一页</a> |\n" +
                        "                           <input type=\"button\" value=\"下一页\" id=\"btn\" onclick=\"sub("+(pageBean.getCurrentPage()+1)+",\'"+institute+"\')\">"+
                        "                           <input type=\"button\" value=\"尾页\" id=\"btn\" onclick=\"sub("+(pageBean.getTotalPage())+",\'"+institute+"\')\">"+
    //                    "                            <a href = \"getAllTeachingClass?currentPage="+pageBean.getTotalPage()+"\">尾页</a>\n" +
    //                    "                        </c:if>\n" +
                        "                    </td>\n" +
                        "                </tr>");
            }
            writer.println(" </tbody>\n" +
                    "            </table>");



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
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
