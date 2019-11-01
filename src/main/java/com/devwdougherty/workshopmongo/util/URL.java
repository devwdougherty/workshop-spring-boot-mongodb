package com.devwdougherty.workshopmongo.util;

import java.io.UnsupportedEncodingException;
import java.net.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

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

    /**
     *
     * @param textDate
     * @param defaultValue
     * @return
     */
    public static Date convertDate(String textDate, Date defaultValue) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // We're using the GMT pattern, other way would bet get the user machine pattern and send it in the request.
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        try {
            return sdf.parse(textDate);
        } catch (ParseException e) {
            return defaultValue;
        }
    }

}
