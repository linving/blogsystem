package com.yingming.blogsystem.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.yingming.blogsystem.dao.UserDao;
import com.yingming.blogsystem.domain.User;
import com.yingming.blogsystem.support.YeekuHibernateDaoSupport;

public class UserDaoImpl extends YeekuHibernateDaoSupport implements UserDao {

	@Override
	public User get(Integer userId) {
		return getHibernateTemplate().get(User.class, userId);
	}

	@Override
	public Integer save(User user) {
		return (Integer) getHibernateTemplate().save(user);
	}

	@Override
	public void update(User user) {
		getHibernateTemplate().update(user);

	}

	@Override
	public void delete(User user) {
		getHibernateTemplate().delete(user);

	}

	@Override
	public void delete(Integer userId) {
		getHibernateTemplate().delete(get(userId));

	}

	@Override
	public List<User> findAll() {
		return (List<User>) getHibernateTemplate().find("from User ");
	}

	@Override
	public List<User> findByAccountAndPass(String userAccount, String userPass) {
		return (List<User>) getHibernateTemplate().find(
				"from User a where a.userAccount = ? and a.userPass=?",
				userAccount, userPass);

	}

	@Override
	public List<User> getUser(int userId) {
		return (List<User>) getHibernateTemplate().find(
				"from User a where a.userId = ?", userId);
	}

	@Override
	public List<User> findAll(int offset, int pageSize) {
		return this.findByPage("from User ", offset, pageSize);
	}

	@Override
	public int getTotalUserCounts() {
		int counts=findAll().size();
//		System.out.println("total user counts="+counts);
		return counts;
	}

	@Override
	public List<User> findByAccount(String userAccount) {
		return (List<User>) getHibernateTemplate().find(
				"from User a where a.userAccount = ?",
				userAccount);
	}

}
