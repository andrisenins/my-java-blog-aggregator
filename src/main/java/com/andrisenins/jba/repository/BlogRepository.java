package com.andrisenins.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrisenins.jba.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
