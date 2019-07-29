package com.devwdougherty.workshopmongo.config;

import com.devwdougherty.workshopmongo.domains.*;

import com.devwdougherty.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 *
 */
@Configuration
public class Instantiation implements CommandLineRunner {

    /**
     *
     */
    @Autowired
    private UserRepository userRepository;

    /**
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User willian = new User(null, "Willian", "willian@gmail.com");
        User dougherty = new User(null, "Dougherty", "dougherty@gmail.com");
        User nascimento = new User(null, "Nascimento", "nascimento@gmail.com");
        User barbosa = new User(null, "Barbosa", "barbosa@gmail.com");

        userRepository.saveAll(Arrays.asList(willian, dougherty, nascimento, barbosa));
    }
}
