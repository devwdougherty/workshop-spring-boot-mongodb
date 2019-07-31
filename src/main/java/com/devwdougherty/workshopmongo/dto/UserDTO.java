package com.devwdougherty.workshopmongo.dto;

import com.devwdougherty.workshopmongo.domains.*;

import java.io.Serializable;

/**
 *
 */
public class UserDTO implements Serializable {

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
    private String email;


    /**
     *
     */
    public UserDTO() {

    }

    /**
     *
     * @param objUser
     */
    public UserDTO(User objUser) {
        id = objUser.getId();
        name = objUser.getName();
        email = objUser.getEmail();
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
