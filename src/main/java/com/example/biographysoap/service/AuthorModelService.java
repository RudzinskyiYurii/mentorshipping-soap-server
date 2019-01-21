package com.example.biographysoap.service;

import com.example.biographysoap.model.AuthorModel;

import java.util.Collection;

public interface AuthorModelService {

    Collection<AuthorModel> findAllAuthors();
    void delete(long id);
    AuthorModel findById(long id);
    AuthorModel findByName(String name);
    void save (AuthorModel author);
}
