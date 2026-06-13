package com.example.demo

import jakarta.persistence.*
enum class Role { USER, ADMIN }
enum class Status { ACTIVE, WITHDRAWN }

@Entity
@Table(name = "users")
class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(unique = true, nullable = false)
    var loginId: String,

    @Column(unique = true, nullable = false)
    var email: String,

    var name: String,
    var password: String,

    @Enumerated(EnumType.STRING)
    var role: Role,

    @Enumerated(EnumType.STRING)
    var status: Status = Status.ACTIVE,

    )

//CREATE TABLE user (
//  id INT PRIMARY KEY,
//  loginId VARCHAR,
//  email VARCHAR,
//  name VARCHAR,
//  password VARCHAR,
//  role ENUM('일반회원', '관리자'),
//  status ENUM('정상', '탈퇴'),
//  UNIQUE INDEX idx_loginId (loginId),
//  UNIQUE INDEX idx_email (email)
//);