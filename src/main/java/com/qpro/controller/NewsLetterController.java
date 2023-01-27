package com.qpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.qpro.model.Story;
import com.qpro.service.NewsLetterService;

@RestController
public class NewsLetterController {

	@Autowired
	 private NewsLetterService service;
	 
	 @GetMapping("/top-stories")
	 public ResponseEntity<List<Story>> getTopStories() {
		 
		 return new ResponseEntity<List<Story>>(service.getTopStories(),HttpStatus.OK);
		
	}
	 @GetMapping("/past-stories")
	 public ResponseEntity<List<Story>> getAllPastStories() {
		
		 
		 return new ResponseEntity<List<Story>>(service.getAllPastStories(),HttpStatus.OK);
	}
	 
	 @GetMapping("/comments/{id}")
	 public ResponseEntity<List<String>> getComments(@PathVariable int id){
		 System.out.println("ID :: "+id);
		 return new ResponseEntity<List<String>>(service.getAllComments(id),HttpStatus.OK);
	 }
	 
	 
}
