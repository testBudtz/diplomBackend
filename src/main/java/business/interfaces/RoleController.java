package business.interfaces;

import data.dbDTO.Role;
import data.interfaces.PersistenceException;

import java.util.List;

/**
 * Created by Christian on 08-06-2017.
 */
public interface RoleController {
    Role getRole(String roleId) throws ValidException, PersistenceException;
    List<Role> getAllRoles() throws PersistenceException;

    Role getPortalAdmin();
    Role getCourseAdmin();
    Role createRole(Role role) throws PersistenceException, DBValidationException;
}
