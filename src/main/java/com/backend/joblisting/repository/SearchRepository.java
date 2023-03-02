package com.backend.joblisting.repository;

import com.backend.joblisting.model.Post;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface SearchRepository {

    List<Post> findByText(String text);
}
