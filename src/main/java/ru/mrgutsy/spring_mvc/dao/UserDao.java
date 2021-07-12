package ru.mrgutsy.spring_mvc.dao;

import ru.mrgutsy.spring_mvc.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    User getUserById(long id);

    List<User> getAllUsers();

    User getUserByName(String username);


}
