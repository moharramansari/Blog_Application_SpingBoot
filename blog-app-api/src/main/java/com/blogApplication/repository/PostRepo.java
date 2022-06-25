package com.blogApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogApplication.entities.Category;
import com.blogApplication.entities.Post;
import com.blogApplication.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);
	List<Post> searchByTitle(String string);
}
