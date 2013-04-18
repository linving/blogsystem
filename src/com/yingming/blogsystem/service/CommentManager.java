package com.yingming.blogsystem.service;

public interface CommentManager {
	
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;
	
	int addComment(Integer userId,Integer journalId,String commentContent);
	
	int deleteComment(Integer commentId);

}
