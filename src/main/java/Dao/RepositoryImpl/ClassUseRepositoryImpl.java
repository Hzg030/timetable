package Dao.RepositoryImpl;

import Dao.DaoUtil.SqlUtil;
import Dao.Entity.ClassUse;
import Dao.Repository.Repository;

import java.io.IOException;
import java.sql.*;
import java.util.List;

public class ClassUseRepositoryImpl implements Repository<ClassUse> {
    private Connection connection;

    public ClassUseRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(ClassUse entity) throws Exception {
        String sql = "insert into classuse (classId, week, time, day) value (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,entity.getClassId());
        preparedStatement.setInt(2,entity.getWeek());
        preparedStatement.setInt(3,entity.getTime());
        preparedStatement.setInt(4,entity.getDay());
        preparedStatement.executeUpdate();
    }

    @Override
    public void update(ClassUse entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List selectAll() {
        return null;
    }

    @Override
    public ClassUse selectById(Long id) {
        return null;
    }

    @Override
    public List<ClassUse> selectByEntity(ClassUse entity) {
        return null;
    }

    public boolean check(int classid,int week,int time) throws Exception{
        String sql = "select * from classuse where classId = ? and week = ? and time = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,classid);
        preparedStatement.setInt(2,week);
        preparedStatement.setInt(3,time);
        ResultSet result =  preparedStatement.executeQuery();
        if(result.next()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        ClassUseRepositoryImpl classUseRepository = new ClassUseRepositoryImpl();
//        System.out.println(classUseRepository.check(1,1,1));
    }
}
