package Dao.RepositoryImpl;

import Dao.Entity.Classes;
import Dao.Repository.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClassesRepositoryImpl implements Repository<Classes> {
    private Connection connection;

    public ClassesRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Classes entity) {

    }

    @Override
    public void update(Classes entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Classes> selectAll() {
        return null;
    }

    @Override
    public Classes selectById(Long id) {
        return null;
    }

    @Override
    public List<Classes> selectByEntity(Classes entity) {
        return null;
    }

//    查找出需要排课的行政班
    public List<String> selectClass() throws  Exception{
        String sql = "select DISTINCT (name) from classes where classes.classId in (" +
                "select classId from timetable,classmaping where timetable.teachingClassId = classmaping.teachingClassId" +
                ")";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<String> list = new ArrayList<>();
        while(resultSet.next()){
            list.add(resultSet.getString(1));
        }
        return list;
    }
}
