package com.andrisenins.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrisenins.jba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
