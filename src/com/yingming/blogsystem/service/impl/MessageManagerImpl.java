package com.yingming.blogsystem.service.impl;


import java.util.Date;
import java.util.List;

import com.yingming.blogsystem.dao.*;
import com.yingming.blogsystem.service.*;
import com.yingming.blogsystem.domain.*;

public class MessageManagerImpl implements MessageManager{
	
	private UserDao userDao;
	private CommentDao commentDao;
	private JournalDao journalDao;
	private MessageDao messageDao;
	
	
	@Override
	public int getTotalMessageCounts() {
		return messageDao.getAllMessageCounts();
	}

	@Override
	public List<Message> listMessage(int offset, int pageSize) {
		return messageDao.findAll(offset, pageSize);
	}

	@Override
	public int addMessage(Integer userId, String messageContent) {
		User user = userDao.get(userId);
		String IPAddress="0.0.0.0";
		Message message = new Message(user,messageContent,IPAddress);
		messageDao.save(message);
		return OP_SUCC;
	}

	@Override
	public int deleteMessage(Integer messageId) {
		messageDao.delete(messageId);
		return OP_SUCC;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public CommentDao getCommentDao() {
		return commentDao;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	public JournalDao getJournalDao() {
		return journalDao;
	}

	public void setJournalDao(JournalDao journalDao) {
		this.journalDao = journalDao;
	}

	public MessageDao getMessageDao() {
		return messageDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	
}
