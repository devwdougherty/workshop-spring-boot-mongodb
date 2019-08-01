package com.devwdougherty.workshopmongo.util;

/**
 *
 */
public class ObjectNotFoundException extends RuntimeException {

    /* RuntimeException don't need treatment
       Exception need treatment */

    private static final long serialVersionUID = 1L;

    /**
     *
     * @param msg
     */
    public ObjectNotFoundException(String msg) {

        /* Repost the message to superclass RuntimeException */
        super(msg);
    }
}
