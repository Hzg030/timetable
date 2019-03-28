package Dao.RepositoryImpl;

import Dao.DaoUtil.SqlUtil;
import Dao.Entity.TeachingClass;
import Dao.Repository.Repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    public List<TeachingClass> selectAll() throws Exception{
        List<TeachingClass> list = new ArrayList<>();
        Statement statement = connection.createStatement();
        String sql = "select * from teachingclass";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            TeachingClass teachingClass = new TeachingClass();
            teachingClass.setInstitute(resultSet.getString("institute"));
            teachingClass.setMajor(resultSet.getString("major"));
            teachingClass.setName(resultSet.getString("name"));
            teachingClass.setTeacherId(resultSet.getInt("teacherId"));
            teachingClass.setTeachingClassId(resultSet.getInt("teachingClassId"));
            teachingClass.setTotalCount(resultSet.getInt("totalCount"));
            teachingClass.setNumber(resultSet.getInt("number"));
            list.add(teachingClass);

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
}
