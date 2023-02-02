package com.kerrrusha.springblogwebapp.repo;

import com.kerrrusha.springblogwebapp.models.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {}
