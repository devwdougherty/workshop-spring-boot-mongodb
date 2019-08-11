package com.devwdougherty.workshopmongo.config;

import com.devwdougherty.workshopmongo.domains.*;

import com.devwdougherty.workshopmongo.repositories.PostRepository;
import com.devwdougherty.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

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
     */
    @Autowired
    private PostRepository postRepository;

    /**
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User willian = new User(null, "Willian", "willian@gmail.com");
        User dougherty = new User(null, "Dougherty", "dougherty@gmail.com");
        User nascimento = new User(null, "Nascimento", "nascimento@gmail.com");
        User barbosa = new User(null, "Barbosa", "barbosa@gmail.com");

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem!", "Vou viajar para São Paulo. Abraços!", willian);
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia!", "Acordei feliz hoje!", dougherty);
        //Post post3 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem!", "Vou viajar para São Paulo. Abraços!");


        userRepository.saveAll(Arrays.asList(willian, dougherty, nascimento, barbosa));
        postRepository.saveAll(Arrays.asList(post1, post2));

    }
}
