package com.example.kopring.blog.repository

import com.example.kopring.blog.entity.Wordcount
import org.springframework.data.repository.CrudRepository

interface WordRepository : CrudRepository<Wordcount, String> {
    fun findTop10ByOrderByCntDesc(): List<Wordcount>
}