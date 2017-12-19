package com.eason;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.jpa.repository.Query;

import com.eason.Article;


public interface ArticleRepository extends CrudRepository<Article, Long> {
}