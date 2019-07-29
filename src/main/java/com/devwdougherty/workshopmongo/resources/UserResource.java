package com.devwdougherty.workshopmongo.resources;

import com.devwdougherty.workshopmongo.domains.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
@RestController
@RequestMapping(value="/users")
public class UserResource {

    /**
     *
     * @return
     */
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User firstUser = new User("1", "User 1", "user1@gmail.com");
        User secondUser = new User("2", "User 2", "user2@gmail.com");

        List<User> userList = new ArrayList<>();
        userList.addAll(Arrays.asList(firstUser, secondUser));

        return ResponseEntity.ok(userList);
    }
}
