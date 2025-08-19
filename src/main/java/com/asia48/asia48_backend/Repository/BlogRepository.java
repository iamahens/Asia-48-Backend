package com.asia48.asia48_backend.Repository;

import com.asia48.asia48_backend.Model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

    Optional<Blog> findBySlug(String slug);
}
