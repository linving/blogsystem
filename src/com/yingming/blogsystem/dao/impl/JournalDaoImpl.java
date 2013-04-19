package com.yingming.blogsystem.dao.impl;

import java.util.List;

import com.yingming.blogsystem.dao.JournalDao;
import com.yingming.blogsystem.domain.Comment;
import com.yingming.blogsystem.domain.Journal;
import com.yingming.blogsystem.domain.Message;
import com.yingming.blogsystem.support.YeekuHibernateDaoSupport;

public class JournalDaoImpl extends YeekuHibernateDaoSupport implements JournalDao{

	
	@Override
	public List<Journal> findAllByUserId(int userId) {
		return (List<Journal>) getHibernateTemplate().find("from Journal a where a.user.userId =?",userId);
	}

	@Override
	public List<Journal> findAllByUserId(int userId, int offset, int pageSize) {
		return this.findByPage("from Journal a order by saveTime desc where a.user.userId =",
				offset, pageSize,userId);
	}

	@Override
	public int getAllJournalCountsByUserId(int userId) {
		return findAllByUserId(userId).size();
	}

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
