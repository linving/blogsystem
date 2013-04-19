package com.yingming.blogsystem.service.impl;

import java.util.Date;
import java.util.List;

import com.yingming.blogsystem.dao.*;
import com.yingming.blogsystem.domain.*;
import com.yingming.blogsystem.service.*;

public class UserManagerImpl implements UserManager {
	private UserDao userDao;
	private CommentDao commentDao;
	private JournalDao journalDao;
	private MessageDao messageDao;
	
	
	
	@Override
	public User getUserByUserId(int userId) {
		return userDao.get(userId);
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


	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public int validLogin(String userAccount, String userPass) {
		if (userAccount.length() == 0 || userPass.length() == 0
				|| userAccount == null || userPass == null) {
			return this.OP_FAIL;
		} else if (userDao.findByAccountAndPass(userAccount, userPass).size() == 1) {
			return this.OP_SUCC;
		} else {
			return this.OP_FAIL;
		}
	}


	@Override
	public int addUser(User user) {
		
		if(userDao.findByAccount(user.getUserAccount()).size()==0){
		//	Date date = new Date();
		//	date.hashCode();
		//	user.setRegisterTime(date);
		//	System.out.println("=====");
			userDao.save(user);//数据库中的注册时间设置为自动记录
			return this.OP_SUCC;
		}
		else {
			return this.OP_FAIL;
		}
	}


	@Override
	public int deleteUser(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getUserType(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public User getUserByAccountAndPass(String userAccount, String userPass) {
		User user=null;
		if(userDao.findByAccountAndPass(userAccount, userPass).size() == 0){
			return null;
		}
		user = userDao.findByAccountAndPass(userAccount, userPass).get(0);
		return user;
	}


	
}
