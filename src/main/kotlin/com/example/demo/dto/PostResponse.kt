package com.example.demo.dto

data class PostResponse(
    val id: Long?,
    val title: String,
    val content: String,
)

data class PostCreateRequest (
    val authorId: Long,
    val title: String,
    val content: String,
)