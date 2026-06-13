package com.example.demo.service

import com.example.demo.Post
import com.example.demo.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository
) {
    fun getPosts(): List<Post> {
        return postRepository.findAll()
    }
}