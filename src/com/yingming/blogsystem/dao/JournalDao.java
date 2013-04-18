package com.yingming.blogsystem.dao;

import com.yingming.blogsystem.domain.Journal;

public interface JournalDao {
	
	Journal get(Integer journalId);

	Integer save(Journal journal);

	void update(Journal journal);

	void delete(Journal journal);

	void delete(Integer journalId);

}
