package com.devwdougherty.workshopmongo.domains;

import com.devwdougherty.workshopmongo.dto.AuthorDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 */
@Document(collection = "post")
public class Post implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @Id
    private String id;

    /**
     *
     */
    private Date date;

    /**
     *
     */
    private String title;

    /**
     *
     */
    private String body;

    /**
     *
     */
    private AuthorDTO author;

    /**
     *
     */
    public Post() {
    }

    /**
     *
     * @param id
     * @param date
     * @param title
     * @param body
     */
    public Post(String id, Date date, String title, String body, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
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
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    public String getBody() {
        return body;
    }

    /**]
     *
     * @param body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /***
     *
     * @return
     */
    public AuthorDTO getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     */
    public void setAuthor(AuthorDTO author) {
        this.author = author;
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
        Post post = (Post) o;
        return Objects.equals(id, post.id);
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
