package com.devwdougherty.workshopmongo.dto;

import com.devwdougherty.workshopmongo.domains.*;

import java.io.Serializable;

public class AuthorDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private String id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    public AuthorDTO() {

    }

    /**
     *
     * @param userObj
     */
    public AuthorDTO(User userObj) {
        this.id = userObj.getId();
        this.name = userObj.getName();
    }
}
