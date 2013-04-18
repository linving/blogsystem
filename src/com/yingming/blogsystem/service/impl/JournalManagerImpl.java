package com.yingming.blogsystem.service.impl;


import java.util.Date;

import com.yingming.blogsystem.dao.*;
import com.yingming.blogsystem.service.*;
import com.yingming.blogsystem.domain.*;

public class JournalManagerImpl implements JournalManager{
	
	private UserDao userDao;
	private CommentDao commentDao;
	private JournalDao journalDao;
	private MessageDao messageDao;
	@Override
	public int addJournal(Integer userId, String journalTitle,
			String journalContent) {
		User user = userDao.get(userId);
		Journal journal = new Journal(user,journalTitle,journalContent,new Date(),0);
		return OP_SUCC;
	}
	@Override
	public int deleteJournal(Integer journalId) {
		journalDao.delete(journalId);
		return OP_SUCC;
	}
	
	

}
