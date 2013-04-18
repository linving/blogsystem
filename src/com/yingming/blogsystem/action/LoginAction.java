package com.yingming.blogsystem.action;

import com.yingming.blogsystem.action.base.ManagerBaseAction;
import com.opensymphony.xwork2.ActionContext;
import com.yingming.blogsystem.domain.*;

public class LoginAction extends ManagerBaseAction {

	private String userAccount;
	private String userPass;

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		int result = userManager.validLogin(userAccount, userPass);
		User user;
		user = userManager.getUserByAccountAndPass(userAccount, userPass);

		if (result == userManager.OP_SUCC) {
			ctx.getSession().put("user", user);
			return this.SUCCESS;
		} else {
			return INPUT;
		}

	}
}
