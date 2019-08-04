package com.devwdougherty.workshopmongo.services;

import com.devwdougherty.workshopmongo.domains.*;

import com.devwdougherty.workshopmongo.dto.UserDTO;
import com.devwdougherty.workshopmongo.repositories.UserRepository;
import com.devwdougherty.workshopmongo.util.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    /**
     *
     */
    @Autowired
    private UserRepository userRepository;

    /**
     *
     * @return
     */
    public List<User> findAll() {
        return userRepository.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    public User findById(String id) {

        Optional<User> user = userRepository.findById(id);

        return user.orElseThrow(() -> new ObjectNotFoundException("User not found!"));
    }

    /**
     *
     * @param user
     * @return
     */
    public User insertUser(User user)
    {
        return userRepository.save(user);
    }

    /**
     *
     * @param id
     * @return
     */
    public void deleteById(String id) {

        User user = userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found!"));

        userRepository.delete(user);
    }

    /**
     *
     * @param userDTO
     * @return
     */
    public User fromDTO(UserDTO userDTO) {

        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }

}
