package Dao.RepositoryImpl;

import Dao.Entity.Room;
import Dao.Repository.Repository;

import java.sql.Connection;
import java.util.List;

public class RoomRepositoryImpl implements Repository<Room> {

    private Connection connection;

    public RoomRepositoryImpl(Connection connection) {

        this.connection = connection;
    }

    @Override
    public void save(Room entity) {
        
    }

    @Override
    public void update(Room entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Room> selectAll() {
        return null;
    }

    @Override
    public Room selectById(Long id) {
        return null;
    }

    @Override
    public List<Room> selectByEntity(Room entity) {
        return null;
    }
}
