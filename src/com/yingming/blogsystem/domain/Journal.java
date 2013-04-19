package com.yingming.blogsystem.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Journal implements Serializable{
	
	private static final long serialVersionUID = 48L;
	
	private Integer journalId;
	
	private String journalTitle;
	
	private String journalContent;
	
	private Timestamp saveTime;
	
	private Integer clickCounts;
	
	private User user;
	
	private Set<Comment> comments = new HashSet<Comment>();
	
	public Journal(){
		
	}
	
	public Journal(User user,String journalTitle,String journalContent,
			Integer clickCounts){
		this.user = user;
		this.journalTitle = journalTitle;
		this.journalContent = journalContent;
//		this.saveTime = saveTime;
		this.clickCounts = clickCounts;
		
	}
	public Integer getJournalId() {
		return journalId;
	}
	public void setJournalId(Integer journalId) {
		this.journalId = journalId;
	}
	public String getJournalTitle() {
		return journalTitle;
	}
	public void setJournalTitle(String journalTitle) {
		this.journalTitle = journalTitle;
	}
	public String getJournalContent() {
		return journalContent;
	}
	public void setJournalContent(String journalContent) {
		this.journalContent = journalContent;
	}
	public Date getSaveTime() {
		return saveTime;
	}
	public void setSaveTime(Timestamp saveTime) {
		this.saveTime = saveTime;
	}
	public Integer getClickCounts() {
		return clickCounts;
	}
	public void setClickCounts(Integer clickCounts) {
		this.clickCounts = clickCounts;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	
	

}
