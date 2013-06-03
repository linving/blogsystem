package com.yingming.blogsystem.action;

import com.yingming.blogsystem.action.base.ManagerBaseAction;
import com.opensymphony.xwork2.ActionContext;
import com.yingming.blogsystem.domain.*;

public class RegisterAction extends ManagerBaseAction{
	
	private String userAccount;
	private String userPass;
	private String userName;
	private String defaultUserFaceLocation;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		if(userAccount.length() == 0 || userName.length() == 0 ||
				userPass.length() == 0){
			ctx.getSession().put("tip", "任何字段都不能为空！");
			return "error";
		}
		User user = new User(userAccount,userName,userPass);
		//用户注册时设置默认头像
		user.setUserFaceTitle("default\\default1.jpg");
		int result = userManager.addUser(user);
		if (result == userManager.OP_SUCC) {
			ctx.getSession().put("user", user);
			return this.SUCCESS;
		} else {
			return INPUT;
		}

	}
	public String getDefaultUserFaceLocation() {
		return defaultUserFaceLocation;
	}
	public void setDefaultUserFaceLocation(String defaultUserFaceLocation) {
		this.defaultUserFaceLocation = defaultUserFaceLocation;
	}
	
}
