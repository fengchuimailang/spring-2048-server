package com.liubo.game.domain;

import java.util.List;

/**
 * 列表查询返回模版
 * @author liubo
 *
 * @param <T>
 */
public class QueryReturnTemplet<T> {
	private int count;
	private List<T> list;
	private String retMessage;
	private String isSuccess;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public String getRetMessage() {
		return retMessage;
	}
	public void setRetMessage(String retMessage) {
		this.retMessage = retMessage;
	}
	public String getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	
}
