package Dao.RepositoryImpl;

import Dao.Entity.Teacher;
import Dao.Repository.Repository;

import java.sql.Connection;
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
}
