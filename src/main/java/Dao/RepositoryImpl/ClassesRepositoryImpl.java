package Dao.RepositoryImpl;

import Dao.Entity.Classes;
import Dao.Repository.Repository;

import java.sql.Connection;
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
}
