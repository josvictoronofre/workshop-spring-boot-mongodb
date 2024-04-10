package com.salesjose.workshopmongodb.dto;

import java.io.Serializable;

import com.salesjose.workshopmongodb.domain.User;

public class AuthorDTO implements Serializable {

    private String id;
    private String name;

    public AuthorDTO() {}

    public AuthorDTO(User author) {
        id = author.getId();
        name = author.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}