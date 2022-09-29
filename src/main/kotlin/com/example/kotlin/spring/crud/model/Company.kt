package com.example.kotlin.spring.crud.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table
class Company(
    @Id
    @GeneratedValue
    val id: Int = 0,
    val name: String = "",
    val address: String = ""
)