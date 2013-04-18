package com.yingming.blogsystem.service;

public interface MessageManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;
	
	int addMessage(Integer userId,String messageContent);
	
	int deleteMessage(Integer messageId);

}
