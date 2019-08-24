package com.devwdougherty.workshopmongo.config;

import com.devwdougherty.workshopmongo.domains.*;

import com.devwdougherty.workshopmongo.dto.AuthorDTO;
import com.devwdougherty.workshopmongo.dto.CommentDTO;
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

        userRepository.saveAll(Arrays.asList(willian, dougherty, nascimento, barbosa));

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem!", "Vou viajar para São Paulo. Abraços!", new AuthorDTO(willian));
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia!", "Acordei feliz hoje!", new AuthorDTO(willian));

        CommentDTO commentDTO1 = new CommentDTO("Boa viagem mano!", sdf.parse("21/03/2019"), new AuthorDTO(dougherty));
        CommentDTO commentDTO2 = new CommentDTO("Aproveite parça", sdf.parse("23/03/2019"), new AuthorDTO(willian));
        CommentDTO commentDTO3 = new CommentDTO("Bom bom dia", sdf.parse("25/03/2019"), new AuthorDTO(barbosa));

        post1.getCommentDTOList().addAll(Arrays.asList(commentDTO1, commentDTO2));
        post2.getCommentDTOList().addAll(Arrays.asList(commentDTO3));

        postRepository.saveAll(Arrays.asList(post1, post2));

        willian.getPostList().addAll(Arrays.asList(post1, post2));
        userRepository.save(willian);
    }
}
