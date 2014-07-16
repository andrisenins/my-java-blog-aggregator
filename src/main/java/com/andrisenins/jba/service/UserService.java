package com.andrisenins.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrisenins.jba.entity.User;
import com.andrisenins.jba.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Object findOne(int id) {
        return userRepository.findOne(id);
    }

}
