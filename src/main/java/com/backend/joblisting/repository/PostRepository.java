package com.backend.joblisting.repository;

import com.backend.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface PostRepository extends MongoRepository<Post,String> {


}
