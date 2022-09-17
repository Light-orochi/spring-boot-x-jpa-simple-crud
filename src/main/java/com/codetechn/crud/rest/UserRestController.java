package com.codetechn.crud.rest;


import com.codetechn.crud.entity.User;
import com.codetechn.crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @Autowired
    private UserService userServicies;

    /*@Autowired
    public UserRestController(UserService userService){
       userServicies=userService;

    }*/


    @GetMapping("/users")
    public List<User> findAll(){
        return userServicies.findAll();
    }

    @GetMapping("/users/{user_id}")
    public User getUser(@PathVariable int user_id){
        User user=userServicies.findById(user_id);
        if(user==null){
            throw  new RuntimeException("User not found .- " + user_id);
        }
        return user;
    }

    //post and user
    @PostMapping("/users")
    public User postUser(@RequestBody User user){
        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update
        user.setId(0);
        userServicies.save(user);
        return user;
    }
    //update user
    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        userServicies.save(user);
        return user;
    }

    /*delete user */
    @DeleteMapping("/users/{user_id}")
    public String deleteUSer(@PathVariable int user_id){
      User userExist=  userServicies.findById(user_id);
        if(userExist==null) {
        throw new RuntimeException("user id not found " +user_id);


        }
        userServicies.deleteByid(user_id);
        return "user was deleted from db "+user_id;

    }


}
