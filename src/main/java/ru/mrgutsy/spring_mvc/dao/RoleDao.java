package ru.mrgutsy.spring_mvc.dao;

import ru.mrgutsy.spring_mvc.model.Role;

import java.util.List;

public interface RoleDao {

    void addRole(Role role);

    void updateRole(Role role);

    void removeRoleById(long id);

    List<Role> getAllRoles();

    Role getRoleByName(String name);

}
