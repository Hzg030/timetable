package Dao.RepositoryImpl;

import Dao.Entity.ClassMapping;
import Dao.Repository.Repository;

import java.sql.Connection;
import java.util.List;

public class ClassMappingRepositoryImpl implements Repository<ClassMapping> {

    private Connection connection;

    public ClassMappingRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(ClassMapping entity) {

    }

    @Override
    public void update(ClassMapping entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<ClassMapping> selectAll() {
        return null;
    }

    @Override
    public ClassMapping selectById(Long id) {
        return null;
    }

    @Override
    public List<ClassMapping> selectByEntity(ClassMapping entity) {
        return null;
    }
}
