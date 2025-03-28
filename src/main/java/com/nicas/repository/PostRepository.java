package com.nicas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nicas.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
}
