package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        return Arrays.asList(
                new Post("first post", new Date(),0),
                new Post("second post", new Date(), 0),
                new Post("third post", new Date(), 1)
        );
    }
}
