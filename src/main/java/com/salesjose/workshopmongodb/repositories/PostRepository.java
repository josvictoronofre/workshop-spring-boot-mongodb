package com.salesjose.workshopmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.salesjose.workshopmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
