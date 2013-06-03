package com.yingming.blogsystem.support;

import com.opensymphony.xwork2.ActionContext;

public class TipSession {
	public static void setTipInfo(String info){
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("tip", info);
	}
}
