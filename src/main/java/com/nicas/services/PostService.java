package com.nicas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicas.domain.Post;
import com.nicas.repository.PostRepository;
import com.nicas.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		
			return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
	}
	
}
