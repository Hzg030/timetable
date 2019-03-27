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
    public List<TeachingClass> selectAll(){
            List<TeachingClass> list = new ArrayList<>();
            Connection connection = null;
        try {
            connection = new SqlUtil().getConnection();
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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(connection!=null){
                try {
                    if(connection!=null){
                        connection.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
