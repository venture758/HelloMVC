package com.venture.pojo;

import java.util.Date;
/**
 * ��װ���� ��׼
 * �ӱ��ύ��SPRING MVC���Զ������ࡣ
 * ���Ը���͵��ṩ��ȡ�����÷���
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
