package Dao.Repository;

import java.io.IOException;
import java.util.List;
/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public interface Repository<T> {

    int PAGE_SIZE = 5;

    void save(T entity) throws Exception;

    void update(T entity) throws Exception;

    void delete(Long id) throws Exception;

    List<T> selectAll() throws Exception;

    T selectById(Long id) throws Exception;

    List<T> selectByEntity(T entity) throws Exception;
}
