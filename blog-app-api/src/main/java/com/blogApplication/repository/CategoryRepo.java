package com.blogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogApplication.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
