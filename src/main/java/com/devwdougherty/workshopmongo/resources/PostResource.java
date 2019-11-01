package com.devwdougherty.workshopmongo.resources;

import com.devwdougherty.workshopmongo.domains.Post;
import com.devwdougherty.workshopmongo.domains.User;
import com.devwdougherty.workshopmongo.dto.UserDTO;
import com.devwdougherty.workshopmongo.services.PostService;
import com.devwdougherty.workshopmongo.services.UserService;
import com.devwdougherty.workshopmongo.util.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
@RestController
@RequestMapping(value="/posts")
public class PostResource {

    /**
     *
     */
    @Autowired
    private PostService postService;

    /**
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {

        Post post = postService.findById(id);

        return ResponseEntity.ok().body(post);
    }

    /**
     *
     * @param text
     * @return
     */
    @GetMapping(value = "/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {

        text = URL.decodeParam(text);
        List<Post> postList = postService.findByTitle(text);

        return ResponseEntity.ok().body(postList);
    }

    /**
     *
     * @param text
     * @return
     */
    @GetMapping(value = "/titlesearchquery")
    public ResponseEntity<List<Post>> findTitle(@RequestParam(value = "text", defaultValue = "") String text) {

        text = URL.decodeParam(text);
        List<Post> postList = postService.findTitle(text);

        return ResponseEntity.ok().body(postList);
    }
}
