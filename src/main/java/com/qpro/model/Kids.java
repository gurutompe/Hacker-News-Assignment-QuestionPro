package com.qpro.model;

public class Kids {

	private String by;
	private String id;
	private String parent;
	private String text;
	private String time;
	private String type;

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Kids [by=" + by + ", id=" + id + ", parent=" + parent + ", text=" + text + ", time=" + time + ", type="
				+ type + "]";
	}

}
