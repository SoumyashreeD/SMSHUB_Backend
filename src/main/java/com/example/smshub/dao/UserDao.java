package com.example.smshub.dao;

import com.example.smshub.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

//    User findByClustername(String clustername);
}
