package com.javaee.luizhmpassos.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javaee.luizhmpassos.mongodb.domain.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{

}
