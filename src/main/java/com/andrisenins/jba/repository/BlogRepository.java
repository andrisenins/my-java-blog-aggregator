package com.andrisenins.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrisenins.jba.entity.Blog;
import com.andrisenins.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

    List<Blog> findByUser(User user);
}
