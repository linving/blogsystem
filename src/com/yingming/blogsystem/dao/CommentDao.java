package com.yingming.blogsystem.dao;

import java.util.List;

import com.yingming.blogsystem.domain.Comment;

public interface CommentDao {
	
	Comment get(Integer commentId);

	Integer save(Comment comment);

	void update(Comment comment);

	void delete(Comment comment);

	void delete(Integer commentId);





}
