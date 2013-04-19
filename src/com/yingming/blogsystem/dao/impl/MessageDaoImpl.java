package com.yingming.blogsystem.dao.impl;

import java.util.List;

import com.yingming.blogsystem.dao.MessageDao;
import com.yingming.blogsystem.domain.Comment;
import com.yingming.blogsystem.domain.Message;
import com.yingming.blogsystem.support.YeekuHibernateDaoSupport;

public class MessageDaoImpl extends YeekuHibernateDaoSupport implements MessageDao{
	
	
	@Override
	public int getAllMessageCounts() {
		return this.findAll().size();
	}

	@Override
	public List<Message> findAll() {
		return (List<Message>) getHibernateTemplate().find("from Message");
	}

	@Override
	public List<Message> findAll(int offset, int pageSize) {
		return this.findByPage("from Message order by saveTime desc", offset, pageSize);
	}

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
