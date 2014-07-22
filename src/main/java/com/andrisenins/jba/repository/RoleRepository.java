package com.andrisenins.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrisenins.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

    Role findByName(String string);

}
