package com.briup.syfile.web.interceptor;

import java.util.Date;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LogInterceptor extends AbstractInterceptor{

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("log before:"+new Date()+" ����"+invocation.getAction());
		String resultCode = invocation.invoke();
		System.out.println("log after:"+new Date()+" ����"+invocation.getAction());
		return resultCode;
	}

}
