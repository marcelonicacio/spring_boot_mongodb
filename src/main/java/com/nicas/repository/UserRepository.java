package com.nicas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nicas.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
