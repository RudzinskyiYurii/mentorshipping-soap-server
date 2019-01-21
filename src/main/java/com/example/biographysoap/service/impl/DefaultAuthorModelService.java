package com.example.biographysoap.service.impl;

import com.example.biographysoap.dao.AuthorModelDAO;
import com.example.biographysoap.model.AuthorModel;
import com.example.biographysoap.service.AuthorModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DefaultAuthorModelService implements AuthorModelService {

    @Autowired
    private AuthorModelDAO authorModelDAO;

    @Override
    public Collection<AuthorModel> findAllAuthors() {
        return authorModelDAO.findAll();
    }

    @Override
    public void delete(long id) {
        authorModelDAO.deleteById(id);
    }

    @Override
    public AuthorModel findById(long id) {
        return authorModelDAO.findById(id).get();
    }

    @Override
    public AuthorModel findByName(String name) {
        return authorModelDAO.findByFullName(name);
    }

    @Override
    public void save(AuthorModel author) {
        authorModelDAO.save(author);
    }
}
