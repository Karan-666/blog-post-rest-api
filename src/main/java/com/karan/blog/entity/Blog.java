package com.karan.blog.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Blog {

	@Id
	@GeneratedValue
	private Integer id;

	private String title;

	private String body;

	private String tags;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;

	public Blog(Integer id, String title, String body, String tags) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.tags = tags;
	}

	public Blog() {
		super();
		this.dateCreated = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "Blogs [id=" + id + ", title=" + title + ", body=" + body + ", tags=" + tags + "]";
	}

}
