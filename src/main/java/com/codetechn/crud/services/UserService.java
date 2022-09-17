package com.codetechn.crud.services;

import com.codetechn.crud.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
    void save(User user);
    void deleteByid(int id);

}
