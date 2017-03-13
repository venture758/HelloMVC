package com.venture.pojo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.util.Assert;
/**
 * 该类的唯一用处就是返回只读数据，以便在使用过程中更加安全，所以SpecialDeal有不可变性
 * @author liwenqiang
 *
 */
public class SpecialDeal {
	private Airport departFrom;
	private Airport arriveAt;
	private	BigDecimal cost;
	private Date beginOn;
	private Date endOn;
	public Airport getDepartFrom() {
		return departFrom;
	}
	
	public Airport getArriveAt() {
		return arriveAt;
	}
	
	public BigDecimal getCost() {
		return cost;
	}

	public SpecialDeal(Airport departFrom, Airport arriveAt, BigDecimal cost, Date beginOn, Date endOn) {
		this.departFrom = departFrom;
		this.arriveAt = arriveAt;
		this.cost = cost;
		this.beginOn = beginOn;
		this.endOn = endOn;
	}
	public boolean isValidNow(){
		return isValidOn(new Date());
	}
	public boolean isValidOn(Date date){
		Assert.notNull(date, "Date must not be null");
		Date dateCopy = new Date(date.getTime());
		return ((dateCopy.equals(beginOn)||dateCopy.after(beginOn)) &&
				(dateCopy.equals(endOn)||dateCopy.before(endOn)));
		
		
	}
	
	
	
}
