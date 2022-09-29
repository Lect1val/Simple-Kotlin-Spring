package com.example.kotlin.spring.crud.repository

import com.example.kotlin.spring.crud.model.Company
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository :  JpaRepository<Company, Int> {
    fun findByName(name: String): Company
}