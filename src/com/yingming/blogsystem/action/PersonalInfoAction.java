package com.yingming.blogsystem.action;

import com.opensymphony.xwork2.ActionContext;
import com.yingming.blogsystem.action.base.ManagerBaseAction;
import com.yingming.blogsystem.domain.User;

public class PersonalInfoAction extends ManagerBaseAction{

	private User user;
	
	
	
	public String show() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		user=null;
		user = (User) ctx.getSession().get("user");
		if(user == null){
			ctx.getSession().put("tip", "无法获得你的session，请登录...");
			return ERROR;
		}
		else
			return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
