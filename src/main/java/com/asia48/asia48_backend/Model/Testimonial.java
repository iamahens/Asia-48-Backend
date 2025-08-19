package com.asia48.asia48_backend.Model;



import jakarta.persistence.*;

@Entity
public class Testimonial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String userDesignation; // e.g., "Student in Japan", "Engineer in Singapore"

    @Column(nullable = false, length = 1000)
    private String content;

    // Could also add a field for a user image URL
    // private String imageUrl;

    // --- Getters and Setters ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDesignation() {
        return userDesignation;
    }

    public void setUserDesignation(String userDesignation) {
        this.userDesignation = userDesignation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

