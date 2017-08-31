package data.interfaces;

import data.dbDTO.User;

/**
 * Created by Christian on 11-05-2017.
 */
public interface UserDAO extends BaseDAO<User>{
    User findByCampusNetId(String campusNetId) throws PersistenceException, ElementNotFoundException;

}
