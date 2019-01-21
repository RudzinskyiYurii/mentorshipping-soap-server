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

    @PostConstruct
    public void init(){

        Author authorTest1 = new Author();
        authorTest1.setAuthorId(1000L);
        authorTest1.setName("Jessalyn Divis");
        authorTest1.setBio("This is test author 1 bio");

        Author authorTest2 = new Author();
        authorTest2.setAuthorId(1002L);
        authorTest2.setName("Rianon Yelland");
        authorTest2.setBio("This is test author 2 bio");

        Author authorTest3 = new Author();
        authorTest3.setAuthorId(1004L);
        authorTest3.setName("Cris Cabrara");
        authorTest3.setBio("This is test author 3 bio");

        authors.put(authorTest1.getName(), authorTest1);
        authors.put(authorTest2.getName(), authorTest2);
        authors.put(authorTest3.getName(), authorTest3);
    }


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
