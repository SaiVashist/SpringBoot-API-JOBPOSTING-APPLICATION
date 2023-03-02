package com.backend.joblisting.controller;


import com.backend.joblisting.repository.PostRepository;
import com.backend.joblisting.model.Post;
import com.backend.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PostController {
    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository searchRepository;
    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @GetMapping("/search/{text}")
    public List<Post> search(@PathVariable String text){
           return searchRepository.findByText(text);
    }
    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post post) {
        return repo.save(post);

    }
}
