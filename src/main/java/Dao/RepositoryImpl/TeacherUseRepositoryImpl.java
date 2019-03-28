package Dao.RepositoryImpl;

import Dao.DaoUtil.SqlUtil;
import Dao.Entity.TeacherUse;
import Dao.Repository.Repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TeacherUseRepositoryImpl implements Repository<TeacherUse> {

    private Connection connection;

    public TeacherUseRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(TeacherUse entity) throws Exception{
        String sql = "insert into teacheruse (teacherId, week, time,day) value (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,entity.getTeacherId());
        preparedStatement.setInt(2,entity.getWeek());
        preparedStatement.setInt(3,entity.getTime());
        preparedStatement.setInt(4,entity.getDay());
        preparedStatement.executeUpdate();
    }

    @Override
    public void update(TeacherUse entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<TeacherUse> selectAll() {
        return null;
    }

    @Override
    public TeacherUse selectById(Long id) {
        return null;
    }

    @Override
    public List<TeacherUse> selectByEntity(TeacherUse entity) {
        return null;
    }

    public boolean check(int teacherId,int week,int time,int day) throws Exception {
        String sql = "select * from teacheruse where teacherId = ? and week = ? and time = ? and day = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, teacherId);
        preparedStatement.setInt(2, week);
        preparedStatement.setInt(3, time);
        preparedStatement.setInt(4, day);
        ResultSet result = preparedStatement.executeQuery();
        if (result.next()) {
            return true;
        }
        return false;
    }
}
