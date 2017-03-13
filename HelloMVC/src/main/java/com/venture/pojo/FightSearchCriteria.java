package com.venture.pojo;

import java.util.Date;
/**
 * 封装搜索 标准
 * 从表单提交中SPRING MVC会自动填充该类。
 * 所以该类就得提供获取和设置方法
 * @author liwenqiang
 *
 */
public class FightSearchCriteria {
	private String departFrom;
	private Date departOn;
	private String arriveAt;
	private Date returnOn;
	public String getDepartFrom() {
		return departFrom;
	}
	public void setDepartFrom(String departFrom) {
		this.departFrom = departFrom;
	}
	public Date getDepartOn() {
		return departOn;
	}
	public void setDepartOn(Date departOn) {
		this.departOn = departOn;
	}
	public String getArriveAt() {
		return arriveAt;
	}
	public void setArriveAt(String arriveAt) {
		this.arriveAt = arriveAt;
	}
	public Date getReturnOn() {
		return returnOn;
	}
	public void setReturnOn(Date returnOn) {
		this.returnOn = returnOn;
	}
	
}
