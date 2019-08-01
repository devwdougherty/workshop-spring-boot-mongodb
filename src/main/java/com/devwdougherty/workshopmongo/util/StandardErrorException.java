package com.devwdougherty.workshopmongo.util;

import java.io.Serializable;

/**
 *
 */
public class StandardErrorException implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long timestamp;

    /**
     *
     */
    private Integer status;

    /**
     *
     */
    private String error;

    /**
     *
     */
    private String message;

    /**
     *
     */
    private String path;

    /**
     *
     */
    public StandardErrorException() {

    }

    /**
     *
     * @param timestamp
     * @param status
     * @param error
     * @param message
     * @param path
     */
    public StandardErrorException(Long timestamp, Integer status, String error, String message, String path) {
        super();
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    /**
     *
     * @return
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     *
     * @param timestamp
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     *
     * @return
     */
    public String getError() {
        return error;
    }

    /**
     *
     * @param error
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     */
    public String getPath() {
        return path;
    }

    /**
     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }
}
