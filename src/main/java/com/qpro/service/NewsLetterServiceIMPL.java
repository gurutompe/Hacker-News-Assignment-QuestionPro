package com.qpro.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.qpro.model.Kids;
import com.qpro.model.Story;

@Service
public class NewsLetterServiceIMPL implements NewsLetterService {

	@Value("${NEW_STORIES}")
	private String url1;

	@Autowired
	private RestTemplate template = new RestTemplate();
	private static final String NEW_STORIES = "https://hacker-news.firebaseio.com/v0/newstories.json?print=pretty";
	private static final String GET_STORY = "https://hacker-news.firebaseio.com/v0/item/";

	@Override
	public List<Story> getTopStories() {

		Object[] objNewStories = template.getForObject(NEW_STORIES, Object[].class);

		List<Story> slist = new ArrayList<Story>();

		for (Object o : objNewStories) {
			String storyUrl = GET_STORY + (int) o + ".json?print=pretty";
			Story story = template.getForObject(storyUrl, Story.class);

			slist.add(story);
		}
		List<Story> list = slist.stream().sorted((s, s1) -> s1.getScore() - s.getScore()).limit(10)
				.collect(Collectors.toList());
		System.out.println(list.size());

		return list;
	}

	@Override
	public List<Story> getAllPastStories() {
		ResponseEntity<Story> story = template.getForEntity(NEW_STORIES, Story.class);

		return null;
	}

	@Override
	public List<String> getAllComments(int id) {
		System.out.println("URL IS :: "+url1);
		String url = GET_STORY + id + ".json?print=pretty";
		ResponseEntity<Story> forEntity = null;
		try {
			forEntity = template.getForEntity(url, Story.class);
		} catch (Exception e) {
			System.out.println("Exception In Fetching Story Content :: " + e);
		}
		Story kid = forEntity.getBody();

		List<Integer> kids = kid.getKids();
		List<String> txt = new ArrayList<String>();
		ResponseEntity<Kids> forEntity2;
		for (Integer integer : kids) {
			String kidsUrl = GET_STORY + integer + ".json?print=pretty";
			forEntity2 = template.getForEntity(kidsUrl, Kids.class);
			String text = forEntity2.getBody().getText();
			txt.add(text);
		}
		return txt.stream().limit(10).collect(Collectors.toList());

	}

}
