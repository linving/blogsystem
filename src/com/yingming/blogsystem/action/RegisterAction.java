package com.yingming.blogsystem.action;

import com.yingming.blogsystem.action.base.ManagerBaseAction;
import com.opensymphony.xwork2.ActionContext;
import com.yingming.blogsystem.domain.*;
import com.yingming.blogsystem.support.TipSession;

public class RegisterAction extends ManagerBaseAction{
	
	private String userAccount;
	private String userPass;
	private String userName;
	private String defaultUserFaceLocation;
	private String mail;
	private String blogName;
	private String blogDescription;
	
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
	
	public void setUserSession(User user){
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("user", user);
	}
	
	public String execute() throws Exception {
		
		if(userAccount.length() == 0 || userName.length() == 0 ||
		   userPass.length() == 0 || mail.length() == 0 || blogName.length() == 0||
		   blogDescription.length() == 0){
			TipSession.setTipInfo("任何字段都不能为空。");
			return ERROR;
		}
		User user = new User(userAccount,userName,userPass);
		//用户注册时设置默认头像
		user.setUserFaceTitle(defaultUserFaceLocation);
		user.setBlogName(blogName);
		user.setBlogDescription(blogDescription);
		user.setMail(mail);
		int result = userManager.addUser(user);
		if (result == userManager.OP_SUCC) {
			setUserSession(user);
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getBlogDescription() {
		return blogDescription;
	}
	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}
	
}
