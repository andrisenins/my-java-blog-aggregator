package com.andrisenins.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrisenins.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByName(String name);

}
