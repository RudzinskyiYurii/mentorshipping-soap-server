package com.example.biographysoap.service;

import com.example.biography.Author;
import com.example.biographysoap.model.AuthorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class AuthorService {

    private static final Map<String, Author> authors = new HashMap<>();

    @Autowired
    private AuthorModelService authorModelService;

    public Author getAuthor(String name) {
        AuthorModel authorModel = authorModelService.findByName(name);
        return convertAuthorModelToAuthor(authorModel);
    }

    private Author convertAuthorModelToAuthor(AuthorModel authorModel) {
        Author author = new Author();
        author.setName(authorModel.getFullName());
        author.setAuthorId(authorModel.getId());
        author.setBio(authorModel.getBiography());
        return author;
    }

}
