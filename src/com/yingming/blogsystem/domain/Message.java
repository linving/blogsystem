package com.yingming.blogsystem.domain;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable{
	
	private static final long serialVersionUID = 48L;
	
	private Integer messageId;
	
	private String messageContent;
	
	private String IPAddress;
	
	private Date saveTime;
	
	private User user;
	
	public Message(){
		
	}
	
	public Message(User user,String messageContent,Date saveTime,String IPAddress){
		this.user = user;
		this.messageContent = messageContent;
		this.saveTime = saveTime;
		this.IPAddress = IPAddress;
	}
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
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
	
	

}
