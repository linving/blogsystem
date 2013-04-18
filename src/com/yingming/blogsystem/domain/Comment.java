package com.yingming.blogsystem.domain;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable{
	private static final long serialVersionUID = 48L;
	
	private Integer commentId;
	
	private String commentContent;
	
	private Date saveTime;
	
	private User user;
	
	private Journal journal;

	public Comment(){
		
	}
	
	public Comment(User user,Journal journal,String commentContent,Date saveTime){
		this.user = user;
		this.journal = journal;
		this.commentContent = commentContent;
		this.saveTime = saveTime;
	}
	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Date getSaveTime() {
		return saveTime;
	}

	public void setSaveTime(Date saveTime) {
		this.saveTime = saveTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Journal getJournal() {
		return journal;
	}

	public void setJournal(Journal journal) {
		this.journal = journal;
	}
	
	

}
