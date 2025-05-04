package com.barchen.app.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255, nullable = false, unique = true)
    private String email;

    @Column(name="password_hash", length = 255, nullable = false)
    private String passwordHash;

    @Column(name = "is_premium", nullable = false)
    private boolean isPremium = false;

    @Column(name="bretzelCount", nullable = false)
    private int bretzelCount = 0;

    @Column(name="created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    //Constructors
    public User(){}

    public User(String email, String passwordHash){
        this.email = email;
        this.passwordHash = passwordHash;
        this.isPremium = false;
        this.bretzelCount = 0;
        this.createdAt = LocalDateTime.now();
    }

    //Getters and Setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPasswordHash(){
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash){
        this.passwordHash = passwordHash;
    }

    public boolean getIsPremium(){
        return isPremium;
    }

    public void setIsPremium(boolean isPremium){
        this.isPremium = isPremium;
    }

    public int getBretzelCount(){
        return bretzelCount;
    }

    public void setBretzelCount(int bretzelCount){
        this.bretzelCount = bretzelCount;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }
}
