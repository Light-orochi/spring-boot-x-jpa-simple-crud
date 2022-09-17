package com.codetechn.crud.dao;

import com.codetechn.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDaoRepository extends JpaRepository<User,Integer> {


}
