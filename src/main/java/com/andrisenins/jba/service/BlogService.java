package com.andrisenins.jba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrisenins.jba.entity.Blog;
import com.andrisenins.jba.entity.User;
import com.andrisenins.jba.repository.BlogRepository;
import com.andrisenins.jba.repository.UserRepository;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    public void save(Blog blog, String name) {
        User user = userRepository.findByName(name);
        blog.setUser(user);
        blogRepository.save(blog);
    }

    public void delete(int id) {
        blogRepository.delete(id);
    }

}
