package com.andrisenins.jba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrisenins.jba.repository.RoleRepository;

@Service
public class InitDbService {
    
    @Autowired
    private RoleRepository roleRepository;

}
