package com.karan.blog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.karan.blog.entity.Blog;

@Service
public interface BlogService {

	public List<Blog> getAllBlogs();

	public Optional<Blog> getBlogById(Integer id);

	public ResponseEntity<HttpStatus> addBlog(Blog blog);

	public ResponseEntity<HttpStatus> updateBlog(Blog blog);

	public ResponseEntity<HttpStatus> deleteBlog(Integer id);

}
