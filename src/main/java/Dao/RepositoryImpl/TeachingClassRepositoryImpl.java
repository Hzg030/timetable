package Dao.RepositoryImpl;

import Dao.DaoUtil.SqlUtil;
import Dao.Entity.FinalTeachingClass;
import Dao.Entity.TeachingClass;
import Dao.Repository.Repository;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeachingClassRepositoryImpl implements Repository<TeachingClass> {

    private Connection connection;


    public TeachingClassRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(TeachingClass entity) {

    }

    @Override
    public void update(TeachingClass entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<TeachingClass> selectAll() throws Exception {
        return null;
    }

    public List<String> selectInstitute() throws Exception{
        String sql = "select DISTINCT (institute) from teachingclass where teachingClassId not in " +
                "(select DISTINCT (teachingClassId) from timetable)";
        List<String> list = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            list.add(resultSet.getString(1));
        }
        return list;
    }

    public List<FinalTeachingClass> selectAllFinal(String institute) throws Exception{
        List<FinalTeachingClass> list = new ArrayList<>();
        String sql = "SELECT teachingclass.teachingClassId, teachingclass.`name` AS className,teacher.teacherId AS teacherId, teacher.`name` AS teacherName, " +
                "teachingclass.institute AS nstitute, teachingclass.major, teacher.phoneNumber, teacher.email, " +
                "teachingclass.number, teachingclass.totalCount FROM teachingclass, teacher WHERE teachingclass.teacherId = teacher.teacherId " +
                "and teachingclass.institute = ? and teachingClassId not in (SELECT DISTINCT(teachingClassId) from timetable)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,institute);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            FinalTeachingClass finalTeachingClass = new FinalTeachingClass(resultSet.getInt(1),resultSet.getString(2)
                    ,resultSet.getInt(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),
                    resultSet.getString(7),resultSet.getString(8),resultSet.getInt(9),resultSet.getInt(10));
            list.add(finalTeachingClass);

        }

        return list;
    }

    @Override
    public TeachingClass selectById(Long id) {
        return null;
    }

    @Override
    public List<TeachingClass> selectByEntity(TeachingClass entity) {
        return null;
    }

    public List<FinalTeachingClass> findArticleByPage(int currentPage,String institute) throws SQLException{
        String sql = "SELECT teachingclass.teachingClassId, teachingclass.`name` AS className, teacher.teacherId As teacherId," +
                "teacher.`name` AS teacherName, teachingclass.institute AS nstitute, teachingclass.major, " +
                "teacher.phoneNumber, teacher.email, teachingclass.number, teachingclass.totalCount FROM teachingclass, " +
                "teacher WHERE teachingclass.teacherId = teacher.teacherId and teachingclass.institute = ? and teachingClassId " +
                "not in (SELECT DISTINCT(teachingClassId) from timetable) limit ? offset ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,institute);
        preparedStatement.setInt(2,PAGE_SIZE);
        preparedStatement.setInt(3,(currentPage-1) * PAGE_SIZE);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<FinalTeachingClass> list = new ArrayList<>();
        while (resultSet.next()){
            FinalTeachingClass finalTeachingClass = new FinalTeachingClass(resultSet.getInt(1),resultSet.getString(2)
                    ,resultSet.getInt(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),
                    resultSet.getString(7),resultSet.getString(8),resultSet.getInt(9),resultSet.getInt(10));
            list.add(finalTeachingClass);

        }
        return list;
    }

    public int findCount(String institute) throws SQLException {
        String sql = "select count(*) from teachingclass where institute = ? and teachingClassId not in " +
                "(select DISTINCT (teachingClassId) from timetable)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,institute);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            return resultSet.getInt(1);

        }else {
            return 0;
        }
        //用于处理平均值，总的个数
    }

    public static void main(String[] args) throws Exception {
//        TeachingClassRepositoryImpl t = new TeachingClassRepositoryImpl(new SqlUtil().getConnection());
//        List<FinalTeachingClass> list = t.selectAllFinal();
//        for (FinalTeachingClass f:list){
//            System.out.println(f.getClassName());
//        }
    }
}
