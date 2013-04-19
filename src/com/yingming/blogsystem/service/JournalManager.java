package com.yingming.blogsystem.service;

import java.util.List;

import com.yingming.blogsystem.domain.*;

public interface JournalManager {
	
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;
	
	int addJournal(Integer userId,String journalTitle,String journalContent);
	
	int deleteJournal(Integer journalId);
	
	int getJournalTotalCountsByUserId(int userId);
	
	List<Journal> getAllJournalByUserId(int userId,int offset,int pageSize);
	
	Journal getJournalByJournalId(int journalId);

}
