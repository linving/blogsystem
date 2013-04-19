package com.yingming.blogsystem.action;

import com.yingming.blogsystem.action.base.ManagerBaseAction;
import com.opensymphony.xwork2.ActionContext;
import com.yingming.blogsystem.domain.*;

public class WriteMessageAction extends ManagerBaseAction {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String execute() throws Exception {

		ActionContext ctx = ActionContext.getContext();
		User user = (User) ctx.getSession().get("user");
		if(content.length() == 0 || content == null){
			ctx.getSession().put("tip", "请输入评论内容哦。。。");
			return ERROR;
		}
//		System.out.println("===="+user.getUserAccount());
		if (user == null) {
			ctx.getSession().put("tip", "请先登陆！");
			return ERROR;
		}
		
		messageManager.addMessage( user.getUserId(), content);
		return SUCCESS;
	}

}
