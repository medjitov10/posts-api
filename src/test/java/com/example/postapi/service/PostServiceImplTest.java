package com.example.postapi.service;

import com.example.postapi.model.Post;
import com.example.postapi.repository.PostRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PostServiceImpl {
    @InjectMocks
    Post post;
    @InjectMocks
    PostServiceImpl postService;
    @Mock
    PostRepository postRepository;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createPost_PostService_Success() {
        when(postRepository.save(any())).thenReturn(post);
        assertEquals(postService.createPost(any(), any()), post);
    }
//    @Override
//    public Post createPost(String username, Post post) {
//        post.setUsername(username);
//        return postRepository.save(post);
//    }
//
//    @Override
//    public Iterable<Post> findAll() {
//        return postRepository.findAll();
//    }
//
//    @Override
//    public void deletePost(Long postId){
//        Post post = postRepository.findById(postId).orElse(null);
//        if(post != null) {
//            commentService.deleteCommentsByPostId(postId);
//            postRepository.delete(post);
//        }
//    }
//
//    @Override
//    public List<Post> getPostByUser(String username) {
//        return postRepository.findByUsername(username);
//    }
//
//    @Override
//    public Post getPostByPostId(Long postId) {
//        Post post = postRepository.findById(postId).orElse(null);
//        return post;
//    }
}
