package com.yingming.blogsystem.dao;

import java.util.List;

import com.yingming.blogsystem.domain.User;

public interface UserDao {

	User get(Integer userId);

	Integer save(User User);

	void update(User User);

	void delete(User User);

	void delete(Integer userId);

	List<User> findAll();

	List<User> findAll(int offset,int pageSize);
	
	List<User> getUser(int userId);

	List<User> findByAccountAndPass(String userAccount, String userPass);
	
	List<User> findByAccount(String userAccount);
	
	int getTotalUserCounts();
}
