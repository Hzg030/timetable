package Dao.Repository;

import java.util.List;
/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public interface Repository<T> {

    void save(T entity);

    void update(T entity);

    void delete(Long id);

    List<T> selectAll();

    T selectById(Long id);

    List<T> selectByEntity(T entity);
}
