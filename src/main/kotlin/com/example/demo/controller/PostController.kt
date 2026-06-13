package com.example.demo.controller

import com.example.demo.dto.PostResponse
import com.example.demo.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/posts")
class PostController(
    private val postService: PostService
) {
    @GetMapping
    fun getPosts(): List<PostResponse> =
        postService.getPosts().map { post ->
            PostResponse(post.id, post.title, post.content)
        }
}