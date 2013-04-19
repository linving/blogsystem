package com.yingming.blogsystem.service;

import java.util.List;

import com.yingming.blogsystem.domain.Message;

public interface MessageManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;
	
	List<Message> listMessage(int offset,int pageSize);
	
	int addMessage(Integer userId,String messageContent);
	
	int deleteMessage(Integer messageId);
	
	int getTotalMessageCounts();

}
