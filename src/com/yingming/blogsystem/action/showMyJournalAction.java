package com.yingming.blogsystem.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.yingming.blogsystem.action.base.ManagerBaseAction;
import com.yingming.blogsystem.domain.*;

public class showMyJournalAction extends ManagerBaseAction {
	private List<Journal> journals;
	private int totalRecordCounts;//总记录数
	private int totalPageCounts;//总页数
	private int currentPage=1;
	private int pageSize=5;
	private int userId;
	
	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		User user = (User) ctx.getSession().get("user");
		int userId = user.getUserId();
		if(user == null){
			ctx.getSession().put("tip", "无法获得你的session，请登录...");
			return ERROR;
		}
		totalRecordCounts = journalManager.getJournalTotalCountsByUserId(userId);
		totalPageCounts=(totalRecordCounts+pageSize-1)/pageSize;
		if(currentPage<=0){
			currentPage=1;
		}
		if( currentPage > totalPageCounts && currentPage > 0 ){
			currentPage = totalPageCounts;
		}	
		
		journals = journalManager.getAllJournalByUserId(userId,pageSize*(currentPage-1),pageSize);
		return SUCCESS;
	}

	
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public List<Journal> getJournals() {
		return journals;
	}
	public void setJournals(List<Journal> journals) {
		this.journals = journals;
	}
	public int getTotalRecordCounts() {
		return totalRecordCounts;
	}
	public void setTotalRecordCounts(int totalRecordCounts) {
		this.totalRecordCounts = totalRecordCounts;
	}
	public int getTotalPageCounts() {
		return totalPageCounts;
	}
	public void setTotalPageCounts(int totalPageCounts) {
		this.totalPageCounts = totalPageCounts;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	

}
