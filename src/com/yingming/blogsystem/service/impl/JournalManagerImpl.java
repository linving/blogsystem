package com.yingming.blogsystem.service.impl;


import java.util.Date;
import java.util.List;

import com.yingming.blogsystem.dao.*;
import com.yingming.blogsystem.service.*;
import com.yingming.blogsystem.domain.*;

public class JournalManagerImpl implements JournalManager{
	
	private UserDao userDao;
	private CommentDao commentDao;
	private JournalDao journalDao;
	private MessageDao messageDao;
	
	
	@Override
	public int getJournalTotalCountsByUserId(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Journal> getAllJournalByUserId(int userId, int offset,
			int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Journal getJournalByJournalId(int journalId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addJournal(Integer userId, String journalTitle,
			String journalContent) {
		User user = userDao.get(userId);
		Journal journal = new Journal(user,journalTitle,journalContent,0);
		journalDao.save(journal);
		return OP_SUCC;
	}
	
	@Override
	public int deleteJournal(Integer journalId) {
		journalDao.delete(journalId);
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
