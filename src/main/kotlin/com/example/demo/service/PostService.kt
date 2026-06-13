package com.example.demo.service

import com.example.demo.Post
import com.example.demo.dto.PostCreateRequest
import com.example.demo.repository.PostRepository
import com.example.demo.repository.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository,
    private val userRepository: UserRepository
) {
    fun getPosts(): List<Post> {
        return postRepository.findAll()
    }

    fun createPost(request: PostCreateRequest): Post {
//        val author = userRepository.findById(request.authorId) ?: throw IllegalArgumentException("user doesn't exist")
        val author = userRepository.findByIdOrNull(request.authorId)
            ?: throw IllegalArgumentException("user doesn't exist")

        val post = Post(title = request.title, content = request.content, user = author)
        return postRepository.save(post)
    }
}