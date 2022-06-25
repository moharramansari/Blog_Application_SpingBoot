package com.blogApplication.payloads;

import java.util.Date;
import java.util.Locale.Category;

import com.blogApplication.entities.User;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PostDto {
	
	private String title;
	private String content;
	private String imageName;
	private Date addedDate;
	private CategoryDto category;
	private User user;
	
}
