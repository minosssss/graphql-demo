package com.example.demo.graphql.graphql;

import com.example.demo.graphql.model.User;
import com.example.demo.graphql.model.UserInput;
import com.example.demo.graphql.service.UserService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserResolver implements GraphQLQueryResolver, GraphQLMutationResolver {


    private final UserService userService;

    public User getUserById(int id) {
        return userService.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public User createUser(UserInput input) {
        User user = new User();
        user.setName(input.getName());
        user.setEmail(input.getEmail());
        return userService.createUser(user);
    }
//
//    public void updateUser(int id, User input) {
//        User user = new User();
//        user.setName(input.getName());
//        user.setEmail(input.getEmail());
//        userService.updateUser(id, user);
//    }
//
//    public void deleteUser(int id) {
//        userService.deleteUser(id);
//    }
}
