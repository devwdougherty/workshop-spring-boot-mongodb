package com.devwdougherty.workshopmongo.resources;

import com.devwdougherty.workshopmongo.domains.*;

import com.devwdougherty.workshopmongo.dto.UserDTO;
import com.devwdougherty.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
@RestController
@RequestMapping(value="/users")
public class UserResource {

    /**
     *
     */
    @Autowired
    private UserService userService;

    /**
     *
     * @return
     */
    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {

        List<User> userList = userService.findAll();
        List<UserDTO> userDTOList = userList.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());

        return ResponseEntity.ok().body(userDTOList);
    }
}
