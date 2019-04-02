package Dao.RepositoryImpl;

import Dao.Entity.Teacher;
import Dao.Repository.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepositoryImpl implements Repository<Teacher> {

    private Connection connection;

    public TeacherRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Teacher entity) {

    }

    @Override
    public void update(Teacher entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Teacher> selectAll() {
        return null;
    }

    @Override
    public Teacher selectById(Long id) {
        return null;
    }

    @Override
    public List<Teacher> selectByEntity(Teacher entity) {
        return null;
    }

//    查找出需要排课的教师
    public List<String> selectTeacjer() throws  Exception{
        String sql = "select DISTINCT (name) from teacher where teacherId in ( select teacherId from timetable)";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<String> list = new ArrayList<>();
        while(resultSet.next()){
            list.add(resultSet.getString(1));
        }
        return list;
    }
}
