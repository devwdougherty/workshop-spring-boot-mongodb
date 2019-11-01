package com.devwdougherty.workshopmongo.util;

import java.io.UnsupportedEncodingException;
import java.net.*;

/**
 *
 */
public class URL {

    /**
     *
     * @param text
     * @return
     */
    public static String decodeParam(String text) {

        try {
            return URLDecoder.decode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }
}
