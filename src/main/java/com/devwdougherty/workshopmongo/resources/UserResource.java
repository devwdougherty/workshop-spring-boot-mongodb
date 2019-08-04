package com.devwdougherty.workshopmongo.resources;

import com.devwdougherty.workshopmongo.domains.User;
import com.devwdougherty.workshopmongo.dto.UserDTO;
import com.devwdougherty.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    /**
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable String id) {

        User user = userService.findById(id);

        return ResponseEntity.ok().body(new UserDTO((user)));
    }

    /**
     *
     * @param id
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> insertUser(@RequestBody UserDTO userDTO) {

        User user = userService.fromDTO(userDTO);

        user = userService.insertUser(user);

        // Good practice: return the location of recent record created.
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}
