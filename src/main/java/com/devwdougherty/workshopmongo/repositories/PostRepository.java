package com.devwdougherty.workshopmongo.repositories;

import com.devwdougherty.workshopmongo.domains.Post;
import com.devwdougherty.workshopmongo.domains.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    
}
