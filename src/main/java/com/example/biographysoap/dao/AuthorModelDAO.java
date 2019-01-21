package com.example.biographysoap.dao;

import com.example.biographysoap.model.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorModelDAO extends JpaRepository<AuthorModel, Long> {
    AuthorModel findByFullName(String name);
}
