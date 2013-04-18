package com.yingming.blogsystem.service.impl;

import java.util.Date;

import com.yingming.blogsystem.domain.*;
import com.yingming.blogsystem.dao.*;
import com.yingming.blogsystem.service.*;
public class CommentManagerImpl implements CommentManager {

	private UserDao userDao;
	private CommentDao commentDao;
	private JournalDao journalDao;
	private MessageDao messageDao;
	
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

	@Override
	public int addComment(Integer userId, Integer journalId,String commentContent) {
		User user;
		Journal journal;
		user = userDao.get(userId);
		journal = journalDao.get(journalId);
		Comment comment = new Comment(user,journal,commentContent,new Date());
		commentDao.save(comment);
		return OP_SUCC;
	}

	@Override
	public int deleteComment(Integer commentId) {
		commentDao.delete(commentId);
		return 0;
	}

	
}
