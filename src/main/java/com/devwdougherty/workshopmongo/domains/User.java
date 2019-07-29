package com.devwdougherty.workshopmongo.domains;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 */
public class User implements Serializable {

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
    public User() {

    }

    /**
     *
     * @param id
     * @param name
     * @param email
     */
    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
