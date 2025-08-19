
package com.asia48.asia48_backend.controller;

import com.asia48.asia48_backend.Model.Blog;
import com.asia48.asia48_backend.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public ResponseEntity<List<Blog>> getAllBlogs() {
        return ResponseEntity.ok(blogService.getAllBlogs());
    }

    @GetMapping("/{slug}")
    public ResponseEntity<Blog> getBlogBySlug(@PathVariable String slug) {
        return blogService.getBlogBySlug(slug)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // This endpoint would be secured for admins in a real application
    @PostMapping
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog) {
        return ResponseEntity.ok(blogService.createBlog(blog));
    }
}
