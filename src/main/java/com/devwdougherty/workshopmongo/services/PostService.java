package com.devwdougherty.workshopmongo.services;

import com.devwdougherty.workshopmongo.domains.Post;
import com.devwdougherty.workshopmongo.domains.User;
import com.devwdougherty.workshopmongo.dto.UserDTO;
import com.devwdougherty.workshopmongo.repositories.PostRepository;
import com.devwdougherty.workshopmongo.repositories.UserRepository;
import com.devwdougherty.workshopmongo.util.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    /**
     *
     */
    @Autowired
    private PostRepository postRepository;

    /**
     *
     * @return
     */
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    public Post findById(String id) {

        Optional<Post> post = postRepository.findById(id);

        return post.orElseThrow(() -> new ObjectNotFoundException("Post not found!"));
    }

    /**
     *
     * @param text
     * @return
     */
    public List<Post> findByTitle(String text) {

        return postRepository.findByTitleContainingIgnoreCase(text);
    }

    /**
     *
     * @param text
     * @return
     */
    public List<Post> findTitle(String text) {

        return postRepository.findTitle(text);
    }

    /**
     *
     * @param id
     * @return
     */
    /*public List<Post> findPostsByUserId(String id) {

        List<Post> posts = userRepository.findById(id).get().getPostList();

        return posts;
    }*/

    /**
     *
     * @param user
     * @return
     */
    /*public User insertUser(User user)
    {
        return userRepository.save(user);
    }*/

    /**
     *
     * @param id
     * @return
     */
    /*public void deleteById(String id) {

        User user = userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found!"));

        userRepository.delete(user);
    }*/

    /**
     *
     * @param id
     * @param user
     * @return
     */
    /*public User putUpdate(String id, User user) {

        User newUser = userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found!"));

        updateRecord(newUser, user);

        return userRepository.save(newUser);
    }*/

    /**
     *
     * @param newUser
     * @param user
     */
    /*private void updateRecord(User newUser, User user) {

        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
    }*/

    /**
     *
     * @param userDTO
     * @return
     */
    /*public User fromDTO(UserDTO userDTO) {

        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }*/

}
