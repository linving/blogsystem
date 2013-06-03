package com.yingming.blogsystem.action;

import java.util.List;

import com.yingming.blogsystem.action.base.ManagerBaseAction;
import com.yingming.blogsystem.domain.User;

public class GetUserListAction extends ManagerBaseAction{

	private List<User> users;
	private int listCount;
	
	public String execute() throws Exception {
		users = userManager.getUserList(0, listCount);
		return SUCCESS;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public int getListCount() {
		return listCount;
	}

	public void setListCount(int listCount) {
		this.listCount = listCount;
	}
	
	
}
