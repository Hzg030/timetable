package Dao.RepositoryImpl;

import Dao.DaoUtil.SqlUtil;
import Dao.Entity.RoomUse;
import Dao.Repository.Repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RoomUseRepositoryImpl implements Repository<RoomUse> {

    private Connection connection;

    public RoomUseRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(RoomUse entity) throws Exception{
        String sql = "insert into roomuse (roomId, week, time,day) value (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,entity.getRoomId());
        preparedStatement.setInt(2,entity.getWeek());
        preparedStatement.setInt(3,entity.getTime());
        preparedStatement.setInt(4,entity.getDay());
        preparedStatement.executeUpdate();
    }

    @Override
    public void update(RoomUse entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<RoomUse> selectAll() {
        return null;
    }

    @Override
    public RoomUse selectById(Long id) {
        return null;
    }

    @Override
    public List<RoomUse> selectByEntity(RoomUse entity) {
        return null;
    }

    public boolean check(int roomid,int week,int time,int day) throws Exception{
        String sql = "select * from roomuse where roomId = ? and week = ? and time = ? and day =? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,roomid);
        preparedStatement.setInt(2,week);
        preparedStatement.setInt(3,time);
        preparedStatement.setInt(4,day);
        ResultSet result =  preparedStatement.executeQuery();
        if(result.next()){
            return true;
        }
        return false;
    }
}
