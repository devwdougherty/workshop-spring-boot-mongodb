package com.devwdougherty.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
public class CommentDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private String text;

    /**
     *
     */
    private Date date;

    /**
     *
     */
    private AuthorDTO authorDTO;

    /**
     *
     * @param text
     * @param date
     * @param authorDTO
     */
    public CommentDTO(String text, Date date, AuthorDTO authorDTO) {
        super();
        this.text = text;
        this.date = date;
        this.authorDTO = authorDTO;
    }

    /**
     *
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
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
    public AuthorDTO getAuthorDTO() {
        return authorDTO;
    }

    /**
     *
     * @param authorDTO
     */
    public void setAuthorDTO(AuthorDTO authorDTO) {
        this.authorDTO = authorDTO;
    }
}
