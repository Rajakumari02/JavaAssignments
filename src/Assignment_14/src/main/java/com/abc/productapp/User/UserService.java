package com.abc.productapp.User;
import java.util.List;

import jdk.jshell.spi.ExecutionControl;

public interface UserService {

    User addUser(User user) throws UserException;
    User getUserById(Integer id) throws UserException;
    User updateUserPasswordById(Integer id,User user) throws UserException;
    User deleteUserById(Integer id) throws UserException;
    List<User> getAllUsers() throws UserException;
}