// File: src/main/java/com/asia48/asia48_backend/service/BlogService.java
package com.asia48.asia48_backend.service;

import com.asia48.asia48_backend.Model.Blog;
import com.asia48.asia48_backend.Repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    public Optional<Blog> getBlogBySlug(String slug) {
        return blogRepository.findBySlug(slug);
    }

    public Blog createBlog(Blog blog) {

        blog.setPublishedDate(LocalDate.now());
        return blogRepository.save(blog);
    }
}
