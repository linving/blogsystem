package com.yingming.blogsystem.dao.impl;

import java.util.List;

import com.yingming.blogsystem.dao.CommentDao;
import com.yingming.blogsystem.domain.Comment;
import com.yingming.blogsystem.domain.User;
import com.yingming.blogsystem.support.YeekuHibernateDaoSupport;

public class CommentDaoImpl extends YeekuHibernateDaoSupport implements CommentDao{

	@Override
	public Comment get(Integer commentId) {
		return getHibernateTemplate().get(Comment.class, commentId);
	}

	@Override
	public Integer save(Comment comment) {
		return (Integer) getHibernateTemplate().save(comment);
	}

	@Override
	public void update(Comment comment) {
		getHibernateTemplate().update(comment);
		
	}

	@Override
	public void delete(Comment comment) {
		getHibernateTemplate().delete(comment);
		
	}

	@Override
	public void delete(Integer commentId) {
		delete(get(commentId));
		
	}



	
}
