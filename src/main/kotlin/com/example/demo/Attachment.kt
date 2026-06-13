package com.example.demo
import jakarta.persistence.*

@Entity
@Table(name = "attachments")
class Attachment (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(unique = true, nullable = false)
    var status: String,

    var fileName: String,
    var fileLink: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    var post: Post? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    var comment: Comment? = null,

    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: User,
)