package com.example.demo
import jakarta.persistence.*

@Entity
@Table(name = "posts")
class Post (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var title: String,
    var content: String,

    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: User,
)