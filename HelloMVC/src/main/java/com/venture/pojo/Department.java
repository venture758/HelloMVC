package com.venture.pojo;

import java.io.Serializable;
import java.util.List;

public class Department     implements Comparable<Department>,Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id ;
	private int pid;
	private String name;
	private List<Department> children;
	private int sort;
	
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Department> getChildren() {
		return children;
	}
	public void setChildren(List<Department> children) {
		this.children = children;
	}
	@Override
	public int compareTo(Department o) {
		// TODO Auto-generated method stub
		return this.getSort()-o.getSort();
	}
	
	

}
