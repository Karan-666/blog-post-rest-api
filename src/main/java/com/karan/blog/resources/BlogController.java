package com.karan.blog.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.karan.blog.entity.Blog;
import com.karan.blog.services.BlogService;

@RestController
public class BlogController {

	@Autowired
	private BlogService blogDao;

	@GetMapping("/blogs")
	public List<Blog> getAllBlogs() {
		return blogDao.getAllBlogs();
	}

	@GetMapping("/blogs/{id}")
	public Optional<Blog> getBlogById(@PathVariable Integer id) {
		return blogDao.getBlogById(id);
	}

	@PostMapping("/blogs")
	public ResponseEntity<HttpStatus> addBlog(@RequestBody Blog blog) {
		return blogDao.addBlog(blog);
	}

	@PutMapping("/blogs")
	public ResponseEntity<HttpStatus> updateBlog(@RequestBody Blog blog) {
		return blogDao.updateBlog(blog);
	}

	@DeleteMapping("/blogs/{id}")
	public void deleteBlog(@PathVariable Integer id) {
		blogDao.deleteBlog(id);
	}

}
