package com.example.demo
import jakarta.persistence.*

@Entity
@Table(name = "comments")
class Comment (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var detail: String,

//  @OneToOne은 1:1 관계일 때 사용.
//  @ManyToOne은 1:N 관계일 때 사용.
    @ManyToOne
    @JoinColumn(name = "post_id")
    var post: Post,

    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: User,
)