package com.codetechn.crud.services;

import com.codetechn.crud.dao.UserDaoRepository;
import com.codetechn.crud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoRepository userDaoRepositori;

   /* public UserServiceImpl(UserDaoRepository userDaoRepository){
        userDaoRepositori =userDaoRepository;
    }*/


    @Override
    public List<User> findAll() {
        return userDaoRepositori.findAll();
    }

    @Override
    public User findById(int id) {
        Optional<User> result = userDaoRepositori.findById(id);
        User theUSer =null;
        if (result.isPresent()){
            theUSer=result.get();
        }else {
            throw new RuntimeException("Dis not find user id -" +id);
        }

        return theUSer;
    }

    @Override
    public void save(User user) {
       userDaoRepositori.save(user);
    }

    @Override
    public void deleteByid(int id) {
        userDaoRepositori.deleteById(id);
    }
}
