package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class PostService {
    List<Post> posts;

    public PostService() {
        this.posts = new LinkedList<Post>();
        posts.addAll(Arrays.asList(
                new Post("first post", new Date()),
                new Post("second post", new Date()),
                new Post("third post", new Date())));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text, Date date) {
        posts.add(new Post(text, new Date()));
    }
}
