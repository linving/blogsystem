package com.yingming.blogsystem.action.base;

import com.opensymphony.xwork2.ActionSupport;
import com.yingming.blogsystem.service.*;

public class ManagerBaseAction extends ActionSupport {
	
	protected UserManager userManager;
	
	protected CommentManager commentManager;
	
	protected JournalManager journalManager;
	
	protected MessageManager messageManager;

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public CommentManager getCommentManager() {
		return commentManager;
	}

	public void setCommentManager(CommentManager commentManager) {
		this.commentManager = commentManager;
	}

	public JournalManager getJournalManager() {
		return journalManager;
	}

	public void setJournalManager(JournalManager journalManager) {
		this.journalManager = journalManager;
	}

	public MessageManager getMessageManager() {
		return messageManager;
	}

	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
	}
	
	
	
	
}
