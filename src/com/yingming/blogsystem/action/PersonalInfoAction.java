package com.yingming.blogsystem.action;

import com.opensymphony.xwork2.ActionContext;
import com.yingming.blogsystem.action.base.ManagerBaseAction;
import com.yingming.blogsystem.domain.User;
import com.yingming.blogsystem.support.TipSession;

public class PersonalInfoAction extends ManagerBaseAction{

	private User user;
	private String userName;
	private String mail;
	private String blogName;
	private String blogDescription;
	private String currentPassword;
	private String newPassword;
	private String confirmNewPassword;
	
	User getUserFromSession(){
		User user_temp = null;
		ActionContext ctx = ActionContext.getContext();
		user_temp = (User) ctx.getSession().get("user");
		user_temp = userManager.getUserByUserId(user_temp.getUserId());
		return user_temp;
	}
	public String show() throws Exception {
		user = getUserFromSession();
		if(user == null){
			TipSession.setTipInfo("无法获得用户session，请重新登陆。");
			return ERROR;
		}
		else
			return SUCCESS;
	}
	
	public String updateInfo() throws Exception {
		user = getUserFromSession();
		if(user == null){
			TipSession.setTipInfo("无法获得用户session，请重新登陆。");
			return ERROR;
		}
		else{
			user.setUserName(userName);
			user.setMail(mail);
			user.setBlogName(blogName);
			user.setBlogDescription(blogDescription);
			if( userManager.updateUser(user) == userManager.OP_SUCC )
				return SUCCESS;
			else {
				TipSession.setTipInfo("更新用户信息出错。");
				return ERROR;
			}
		}
	}
	
	public String updatePassword() throws Exception {
		user = getUserFromSession();
		if(user == null){
			TipSession.setTipInfo("无法获得用户session，请重新登陆。");
			return ERROR;
		}
		else{
			//如果输入的当前密码与数据库中密码不符，则返回错误
			if( !currentPassword.equals(user.getUserPass())){
				TipSession.setTipInfo("输入的密码与现在的密码不一致。");
				return ERROR;
			}
			if( !newPassword.equals( confirmNewPassword ) ){
				TipSession.setTipInfo("两次输入的密码不一致。");
				return ERROR;
			}
			user.setUserPass(newPassword);
			if( userManager.updateUser(user) == userManager.OP_SUCC )
				return SUCCESS;
			else {
				TipSession.setTipInfo("修改密码出错。");
				return ERROR;
			}
		}
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmNewPassword() {
		return confirmNewPassword;
	}

	public void setConfirmNewPassword(String confirmNewPassword) {
		this.confirmNewPassword = confirmNewPassword;
	}
	
}
