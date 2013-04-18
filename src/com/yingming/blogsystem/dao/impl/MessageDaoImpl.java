package com.yingming.blogsystem.dao.impl;

import com.yingming.blogsystem.dao.MessageDao;
import com.yingming.blogsystem.domain.Comment;
import com.yingming.blogsystem.domain.Message;
import com.yingming.blogsystem.support.YeekuHibernateDaoSupport;

public class MessageDaoImpl extends YeekuHibernateDaoSupport implements MessageDao{

	@Override
	public Message get(Integer messageId) {
		return getHibernateTemplate().get(Message.class, messageId);
	}

	@Override
	public Integer save(Message message) {
		return (Integer) getHibernateTemplate().save(message);
	}

	@Override
	public void update(Message message) {
		getHibernateTemplate().update(message);
		
	}

	@Override
	public void delete(Message message) {
		getHibernateTemplate().delete(message);
		
	}

	@Override
	public void delete(Integer messageId) {
		delete(get(messageId));
		
	}

	
}
