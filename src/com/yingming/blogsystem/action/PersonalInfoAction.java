package com.yingming.blogsystem.action;


import com.opensymphony.xwork2.ActionContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.yingming.blogsystem.action.base.ManagerBaseAction;
import com.yingming.blogsystem.domain.User;
import com.yingming.blogsystem.support.*;

public class PersonalInfoAction extends ManagerBaseAction{

	private User user;
	private String userName;
	private String mail;
	private String blogName;
	private String blogDescription;
	private String currentPassword;
	private String newPassword;
	private String confirmNewPassword;
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String savePath;
	
	public User getUserFromSession(){
		User user_temp = null;
		ActionContext ctx = ActionContext.getContext();
		user_temp = (User) ctx.getSession().get("user");
		user_temp = userManager.getUserByUserId(user_temp.getUserId());
		return user_temp;
	}
	public void setUserSession(User user){
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("user", user);
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
			if( userManager.updateUser(user) == userManager.OP_SUCC ){
				setUserSession(user);
				return SUCCESS;
			}
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
			if( userManager.updateUser(user) == userManager.OP_SUCC ){
				setUserSession(user);
				return SUCCESS;
			}
			else {
				TipSession.setTipInfo("修改密码出错。");
				return ERROR;
			}
		}
	}
	
	public String updateUserFace() throws Exception {
		user = getUserFromSession();
		if(user == null){
			TipSession.setTipInfo("无法获得用户session，请重新登陆。");
			return ERROR;
		}
		
		String title = getUploadFileName();
		if(title == null){
			TipSession.setTipInfo("无法获取头像文件名。");
			return ERROR;
		}
	//	System.out.println("****getUploadFileName="+title);
		/* 获得要保存头像的目录 */
		String saveDir = getSavePath() + "//" + user.getUserAccount();
		String saveLocation = saveDir + "//" + title;
		System.out.println("****saveLocation="+saveLocation);
		/* 先创建相应文件夹 */
		if( !FileOperation.makeFolder(saveDir) ){
			TipSession.setTipInfo("以用户账号创建文件夹时出错。");
			return ERROR;
		}
		/* 开始上传 */
		FileOutputStream fos = new FileOutputStream(saveLocation);
		FileInputStream fis = new FileInputStream(getUpload());
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) > 0) {
			fos.write(buffer, 0, len);
		}
		fos.close();
		user.setUserFaceTitle(user.getUserAccount()+"\\"+title);
		/* 上传完保存到数据库 */
		if (userManager.updateUser(user) == userManager.OP_SUCC) {
			setUserSession(user);
			return SUCCESS;
		} else {
			return ERROR;
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
	

	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	private String getSavePath() throws Exception {
		return ServletActionContext.getServletContext().getRealPath(savePath);
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	
}
