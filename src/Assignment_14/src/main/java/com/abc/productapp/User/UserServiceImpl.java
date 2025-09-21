package com.abc.productapp.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userd;

    @Autowired
    public UserServiceImpl(UserRepository userDao) {
        this.userd = userDao;
    }

    @Override
    public User addUser(User user) throws UserException {
        try{
            return this.userd.save(user);
        }catch(Exception e){
            throw new UserException(e.getMessage());
        }
    }

    @Override
    public User getUserById(Integer id) throws UserException {
        Optional<User> user = this.userd.findById(id);
        if(user.isPresent()){
            return user.get();
        }
        else{
            throw new UserException("User not found with this id: " + id);
        }
    }

    @Override
    public User updateUserPasswordById(Integer id,User user) throws UserException {

        Optional<User> updateUser = this.userd.findById(id);
        if(updateUser.isPresent()){
            User updatedUser= updateUser.get();
            updatedUser.setPassword(user.getPassword()+"is updated");
            this.userd.save(updatedUser);
            return updatedUser;
        }
        else{
            throw new UserException("User is not found with this id: " + id);
        }

    }

    @Override
    public User deleteUserById(Integer id) throws UserException {

        Optional<User> existingUser= userd.findById(id);
        if(existingUser.isPresent()){
            this.userd.deleteById(id);
            return existingUser.get();
        }
        else{
            throw new UserException("User is not found with this id: " + id);
        }

    }

    @Override
    public List<User> getAllUsers() throws UserException {
        return userd.findAll();
    }
}