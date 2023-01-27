package com.qpro.model;

import java.util.List;

public class Story {

	private int id;
	private String by;
	private int score;
	private long time;
	private String title;
	private String url;
	private String comments;
	private List<Integer> kids;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<Integer> getKids() {
		return kids;
	}

	public void setKids(List<Integer> kids) {
		this.kids = kids;
	}

	@Override
	public String toString() {
		return "Story [id=" + id + ", by=" + by + ", score=" + score + ", time=" + time + ", title=" + title + ", url="
				+ url + ", comments=" + comments + ", kids=" + kids + "]";
	}

	/*
	 * "by" : "dhouston", "descendants" : 71, "id" : 8863, "kids" : [ 8952, 9224,
	 * 8917, 8884, 8887, 8943, 8869, 8958, 9005, 9671, 8940, 9067, 8908, 9055, 8865,
	 * 8881, 8872, 8873, 8955, 10403, 8903, 8928, 9125, 8998, 8901, 8902, 8907,
	 * 8894, 8878, 8870, 8980, 8934, 8876 ], "score" : 111, "time" : 1175714200,
	 * "title" : "My YC app: Dropbox - Throw away your USB drive", "type" : "story",
	 * "url" : "http://www.getdropbox.com/u/2/screencast.html"
	 * 
	 */
}
