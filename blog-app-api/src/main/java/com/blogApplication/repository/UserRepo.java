package com.blogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blogApplication.entities.User;
public interface UserRepo extends JpaRepository<User, Integer>{
	
}
