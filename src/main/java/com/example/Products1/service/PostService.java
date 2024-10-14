package com.example.Products1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Products1.model.Post;
import com.example.Products1.repository.PostRepository;
@Service
public class PostService {
	@Autowired
	private PostRepository postRepo;
	public void add(Post post) {
		postRepo.save(post);
	}
	public List<Post> view() {
		return postRepo.findAll();
	}
	public Post getPostById(Long postId) {
		return postRepo.findById(postId).get();
	}
}
