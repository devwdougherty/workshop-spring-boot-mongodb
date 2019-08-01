package com.devwdougherty.workshopmongo.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@ControllerAdvice
public class ResourceExceptionHandler {

    /* @ControllerAdvice: Allows you to handle exceptions across the whole application, not just to an individual controller. */

    /**
     *
     * @param e
     * @param request
     * @return
     */
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardErrorException> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {

        HttpStatus status = HttpStatus.NOT_FOUND;

        StandardErrorException err = new StandardErrorException(System.currentTimeMillis(), status.value(), "Not found.", e.getMessage(), request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }
}
