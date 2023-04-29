package com.karan.blog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.karan.blog.entity.Blog;
import com.karan.blog.exception.BlogNotFoundException;
import com.karan.blog.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogRepository blogRepo;

	@Override
	public List<Blog> getAllBlogs() {
		//return blogRepo.findAll();
		
		return blogRepo.findAllByOrderByDateCreatedDesc();
		
	}

	@Override
	public Optional<Blog> getBlogById(Integer id) {

		Optional<Blog> optionalBlog = blogRepo.findById(id);

		if (!optionalBlog.isPresent()) {
			throw new BlogNotFoundException("The id: " + id + " was not found in the database");
		}

		return optionalBlog;

	}

	@Override
	public ResponseEntity<HttpStatus> addBlog(Blog blog) {

		blogRepo.save(blog);

		return new ResponseEntity<>(HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<HttpStatus> updateBlog(Blog blog) {

		Integer id = blog.getId();

		Optional<Blog> optionalBlog = blogRepo.findById(id);

		if (!optionalBlog.isPresent()) {
			throw new BlogNotFoundException("The id: " + id + " was not found in the database");
		}

		blogRepo.save(blog);

		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<HttpStatus> deleteBlog(Integer id) {

		Optional<Blog> optionalBlog = blogRepo.findById(id);

		if (!optionalBlog.isPresent()) {
			throw new BlogNotFoundException("The id: " + id + " was not found in the database");
		}

		blogRepo.deleteById(id);

		return new ResponseEntity<>(HttpStatus.OK);

	}

}
