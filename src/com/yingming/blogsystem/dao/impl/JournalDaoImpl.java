package com.yingming.blogsystem.dao.impl;

import com.yingming.blogsystem.dao.JournalDao;
import com.yingming.blogsystem.domain.Comment;
import com.yingming.blogsystem.domain.Journal;
import com.yingming.blogsystem.support.YeekuHibernateDaoSupport;

public class JournalDaoImpl extends YeekuHibernateDaoSupport implements JournalDao{

	@Override
	public Journal get(Integer journalId) {
		return getHibernateTemplate().get(Journal.class, journalId);
	}

	@Override
	public Integer save(Journal journal) {
		return (Integer) getHibernateTemplate().save(journal);
	}

	@Override
	public void update(Journal journal) {
		getHibernateTemplate().update(journal);
		
	}

	@Override
	public void delete(Journal journal) {
		getHibernateTemplate().delete(journal);
		
	}

	@Override
	public void delete(Integer journalId) {
		delete(get(journalId));
		
	}

	
}
