package Dao.RepositoryImpl;

import Dao.DaoUtil.SqlUtil;
import Dao.Entity.FinalTimeTable;
import Dao.Entity.TimeTable;
import Dao.Repository.Repository;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TimeTableRepositoryImpl implements Repository<TimeTable> {

    private Connection connection;

    public TimeTableRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(TimeTable entity) throws Exception{
        String sql = "insert into timetable.timetable (teachingClassId, teacherId, roomId, week, time,day) value (?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,entity.getTeachingClassId());
        preparedStatement.setInt(2,entity.getTeacherId());
        preparedStatement.setInt(3,entity.getRoomId());
        preparedStatement.setInt(4,entity.getWeek());
        preparedStatement.setInt(5,entity.getTime());
        preparedStatement.setInt(6,entity.getDay());
        preparedStatement.executeUpdate();
    }

    @Override
    public void update(TimeTable entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<TimeTable> selectAll()  {
        return null;
    }



//返回所有的课表
    public List<FinalTimeTable> selectAllFinalTimeTable() throws Exception{
        String sql = "SELECT t3.teachingClassId AS courseId, t3.`name` AS courseName, " +
                "t2.`name` AS teacherName, t2.teacherId, t.`week`, t.time, t.`day`, r.roomNumber, " +
                "building.`name` AS buildingName FROM timetable t, teacher t2, teachingclass t3, " +
                "room r, building WHERE t.teacherId = t2.teacherId and " +
                "t.teachingClassId = t3.teachingClassId  and t.roomId = r.roomId and r.buildingId = building.buildingId";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();
        List<FinalTimeTable> list = new ArrayList<>();
        while(resultSet.next()){
            list.add(new FinalTimeTable(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3)
                    ,resultSet.getInt(4),resultSet.getInt(5),resultSet.getInt(6)
                    ,resultSet.getInt(7),resultSet.getString(8),resultSet.getString(9)));
        }
        return list;
    }

    @Override
    public TimeTable selectById(Long id) {
        return null;
    }

    @Override
    public List<TimeTable> selectByEntity(TimeTable entity) {
        return null;
    }

//   按照教师名字查询该教师的课表
    public List<FinalTimeTable> selectByTeacherName(String teacherName) throws Exception{
        String sql = "SELECT t3.teachingClassId AS courseId, t3.`name` AS courseName, " +
                "t2.`name` AS teacherName, t2.teacherId, t.`week`, t.time, t.`day`, " +
                "r.roomNumber, building.`name` AS buildingName FROM timetable t, teacher t2, " +
                "teachingclass t3, room r, building WHERE t.teacherId = t2.teacherId and " +
                "t.teachingClassId = t3.teachingClassId  and t.roomId = r.roomId " +
                "and r.buildingId = building.buildingId and  t2.name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,teacherName);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<FinalTimeTable> list = new ArrayList<>();
        while(resultSet.next()){
            list.add(new FinalTimeTable(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3)
                    ,resultSet.getInt(4),resultSet.getInt(5),resultSet.getInt(6)
                    ,resultSet.getInt(7),resultSet.getString(8),resultSet.getString(9)));
        }
        return list;
    }

//按照行政班名称查询该行政班的课表
    public List<FinalTimeTable> selectByCLassName(String className) throws Exception{
        String sql = "SELECT t3.teachingClassId AS courseId, " +
                "t3.`name` AS courseName, t2.`name` AS teacherName, t2.teacherId, t.`week`, " +
                "t.time, t.`day`, r.roomNumber, building.`name` AS buildingName " +
                "FROM timetable t, teacher t2, teachingclass t3, room r, building " +
                "WHERE t.teacherId = t2.teacherId and t.teachingClassId = t3.teachingClassId  " +
                "and t.roomId = r.roomId and r.buildingId = building.buildingId  " +
                "and  t3.teachingClassId in (select teachingClassId from classmaping where classid in " +
                "(select classId from classes where name = ?))";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,className);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<FinalTimeTable> list = new ArrayList<>();
        while(resultSet.next()){
            list.add(new FinalTimeTable(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3)
                    ,resultSet.getInt(4),resultSet.getInt(5),resultSet.getInt(6)
                    ,resultSet.getInt(7),resultSet.getString(8),resultSet.getString(9)));
        }
        return list;
    }
//    返回排了课的教师
    public List<String> findAllTeacher() throws Exception{
        String sql = "SELECT DISTINCT(teacher.`name`) FROM timetable, teacher WHERE timetable.teacherId = teacher.teacherId";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<String> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(resultSet.getString(1));
        }
        return list;
    }
    //    返回排了课的行政班
    public List<String> findAllClass() throws Exception{
        String sql = "SELECT name from classes where classId in (SELECT DISTINCT classmaping.classId FROM timetable, classmaping," +
                " classes WHERE timetable.teachingClassId = classmaping.teachingClassId )";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<String> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(resultSet.getString(1));
        }
        return list;
    }
}
