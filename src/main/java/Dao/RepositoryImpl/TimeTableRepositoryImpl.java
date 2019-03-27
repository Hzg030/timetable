package Dao.RepositoryImpl;

import Dao.DaoUtil.SqlUtil;
import Dao.Entity.TimeTable;
import Dao.Repository.Repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TimeTableRepositoryImpl implements Repository<TimeTable> {

    @Override
    public void save(TimeTable entity) {
        Connection connection = null;
        try {
            connection = new SqlUtil().getConnection();
            String sql = "insert into timetable.timetable (teachingClassId, teacherId, roomId, week, time,day) value (?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,entity.getTeachingClassId());
            preparedStatement.setInt(2,entity.getTeacherId());
            preparedStatement.setInt(3,entity.getRoomId());
            preparedStatement.setInt(4,entity.getWeek());
            preparedStatement.setInt(5,entity.getTime());
            preparedStatement.setInt(6,entity.getDay());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
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

    @Override
    public void update(TimeTable entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<TimeTable> selectAll() {
        return null;
    }

    @Override
    public TimeTable selectById(Long id) {
        return null;
    }

    @Override
    public List<TimeTable> selectByEntity(TimeTable entity) {
        return null;
    }
}
