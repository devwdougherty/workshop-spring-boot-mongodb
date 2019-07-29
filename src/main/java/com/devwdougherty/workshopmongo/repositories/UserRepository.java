package com.devwdougherty.workshopmongo.repositories;

import com.devwdougherty.workshopmongo.domains.*;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
}
