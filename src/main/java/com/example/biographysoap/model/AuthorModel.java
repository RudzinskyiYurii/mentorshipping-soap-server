package com.example.biographysoap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="author_tbl")
public class AuthorModel {

    @Id
    @GeneratedValue
    private long id;

    @Column(name="full_name")
    private String fullName;

    @Column(name="bio")
    private String biography;


    public AuthorModel() {
    }

    public AuthorModel(String fullName) {
        this.fullName = fullName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
