package com.devwdougherty.workshopmongo.services;

import com.devwdougherty.workshopmongo.domains.*;

import com.devwdougherty.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
