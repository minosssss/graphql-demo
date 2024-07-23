package com.example.demo.graphql.service;

import com.example.demo.graphql.mapper.UserMapper;
import com.example.demo.graphql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public User createUser(User user) {
        userMapper.insertUser(user);
        return user;
    }
//
//    public User updateUser(int id, User user) {
//        user.setId(id);
//        userMapper.updateUser(user);
//        return user;
//    }
//
//    public void deleteUser(int id) {
//        userMapper.deleteUser(id);
//    }
}
