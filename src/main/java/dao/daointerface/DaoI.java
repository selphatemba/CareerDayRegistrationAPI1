package dao.daointerface;

import java.util.List;

public interface DaoI {
    boolean create(Object o);
    Object read(Object o);
    Object update(Object o);
    boolean delete(Object o);
    List<Object> findAll(Object o);
    Object findByID(Object o);
}
