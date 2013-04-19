package com.yingming.blogsystem.dao;

import java.util.List;

import com.yingming.blogsystem.domain.Journal;
import com.yingming.blogsystem.domain.Message;

public interface JournalDao {
	
	Journal get(Integer journalId);

	Integer save(Journal journal);

	void update(Journal journal);

	void delete(Journal journal);

	void delete(Integer journalId);
	
	List<Journal> findAllByUserId(int userId);
	
	List<Journal> findAllByUserId(int userId,int offset,int pageSize);
	
	int getAllJournalCountsByUserId(int userId);

}
