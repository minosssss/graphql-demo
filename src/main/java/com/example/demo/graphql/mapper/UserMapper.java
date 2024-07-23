package com.example.demo.graphql.mapper;

import com.example.demo.graphql.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users WHERE id = #{id}")
    User getUserById(int id);

    @Select("SELECT * FROM users")
    List<User> getAllUsers();

    @Insert("INSERT INTO users (name, email) VALUES (#{name}, #{email})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertUser(User user);
//
//    @Update("UPDATE users SET name = #{name}, email = #{email} WHERE id = #{id}")
//    void updateUser(User user);
//
//    @Delete("DELETE FROM users WHERE id = #{id}")
//    void deleteUser(int id);
}
