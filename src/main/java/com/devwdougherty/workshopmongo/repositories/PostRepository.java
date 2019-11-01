package com.devwdougherty.workshopmongo.repositories;

import com.devwdougherty.workshopmongo.domains.Post;
import com.devwdougherty.workshopmongo.domains.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 *
 */
@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    /**
     *
     * @param text
     * @return
     */
    List<Post> findByTitleContainingIgnoreCase(String text);

    /**
     * 'i' = Case insensitivity.
     * @param text
     * @return
     */
    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<Post> findTitle(String text);

    /**
     * $gte = Greater than or equal.
     * $lte = Less than or equal.
     * @param text
     * @param minDate
     * @param maxDate
     * @return
     */
    @Query("{ $and: [ {date: { $gte: ?1} }, {date: { $lte: ?2 } }, " +
            "{ $or: [ { 'title': { $regex: ?0, $options: 'i' } }, " +
                     "{ 'body': { $regex: ?0, $options: 'i' } }, " +
                     "{ 'commentDTOList.text': { $regex: ?0, $options: 'i' } } ] } ] }")
    List<Post> fullSearch(String text, Date minDate, Date maxDate);
}
