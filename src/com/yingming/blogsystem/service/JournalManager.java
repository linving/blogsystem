package com.yingming.blogsystem.service;

public interface JournalManager {
	
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;
	
	int addJournal(Integer userId,String journalTitle,String journalContent);
	
	int deleteJournal(Integer journalId);

}
