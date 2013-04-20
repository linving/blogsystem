package com.yingming.blogsystem.action;

import com.opensymphony.xwork2.ActionContext;
import com.yingming.blogsystem.action.base.ManagerBaseAction;
import com.yingming.blogsystem.domain.User;

public class WriteJournalAction extends ManagerBaseAction{
	
	private String title;
	
	private String journalContent;
	
	@Override
	public String execute() throws Exception {

		ActionContext ctx = ActionContext.getContext();
		User user = (User) ctx.getSession().get("user");
		if(user == null){
			ctx.getSession().put("tip", "请先登录哦。。。");
			return ERROR;
		}
		if(journalContent.length() == 0 || journalContent == null){
			ctx.getSession().put("tip", "请输入博客内容哦。。。");
			return ERROR;
		}
		journalManager.addJournal(user.getUserId(), title, journalContent);
		return SUCCESS;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getJournalContent() {
		return journalContent;
	}

	public void setJournalContent(String journalContent) {
		this.journalContent = journalContent;
	}


	
	

}
