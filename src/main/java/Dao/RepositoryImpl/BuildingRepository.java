package Dao.RepositoryImpl;

import Dao.Entity.Building;
import Dao.Repository.Repository;

import java.sql.Connection;
import java.util.List;

public class BuildingRepository implements Repository<Building> {

    private Connection connection;

    public BuildingRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Building entity) {

    }

    @Override
    public void update(Building entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Building> selectAll() {
        return null;
    }

    @Override
    public Building selectById(Long id) {
        return null;
    }

    @Override
    public List<Building> selectByEntity(Building entity) {
        return null;
    }
}
