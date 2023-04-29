package com.karan.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karan.blog.entity.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
	// In built with JpaRepository
	List<Blog> findAllByOrderByDateCreatedDesc();
	
}
