package com.yingming.blogsystem.dao;

import java.util.List;

import com.yingming.blogsystem.domain.Message;

public interface MessageDao {
	
	Message get(Integer messageId);

	Integer save(Message message);

	void update(Message message);

	void delete(Message message);

	void delete(Integer messageId);
	
	List<Message> findAll();
	
	List<Message> findAll(int offset,int pageSize);
	
	int getAllMessageCounts();
}
