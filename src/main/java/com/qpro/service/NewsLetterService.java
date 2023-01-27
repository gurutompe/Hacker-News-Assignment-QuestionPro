package com.qpro.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.qpro.model.Story;

public interface NewsLetterService {

	List<Story> getTopStories();

	List<Story> getAllPastStories();

	List<String> getAllComments(int id);

}
