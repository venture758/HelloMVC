package com.venture.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.venture.pojo.Department;

public class DepartmentService {

	
	public List<Department> queryList(){
		List<Department> list = new ArrayList<Department>();
		Department e = null;
		for (int i = 1; i <= 10000; i++) {
			 e = new Department();
			 e.setId(i);
			 e.setName("Department-"+i);
			 e.setSort(i);
			 if(i==1){
				 e.setPid(0); 
			 }
			 if(i>1&&i<=5){
				 e.setPid(1); 
			 }
			 if(i>5&&i<=10){
				 e.setPid(3);
				 if(i==6) e.setSort(8);
				 if(i==8) e.setSort(6);
			 }
			 if(i>10&&i<=12){
				 e.setPid(5); 
			 }
			 if(i>12&&i<=15){
				 e.setPid(12); 
			 }
			 if(i>15){
				 e.setPid(7); 
			 }
			 list.add(e);
			 
		}
		return list;
	}
	
	
	public List<Department> queryTree(){
		
		List<Department> tree = new ArrayList<Department>();
		List<Department> list = queryList();
		long begin = System.currentTimeMillis();
		for (Department e1 : list) {
			boolean mark = false;
			for (Department e2 : list) {
				if(e1.getPid()!=0 && e1.getPid() == e2.getId()){
					mark = true;
					if(e2.getChildren()==null){
						e2.setChildren(new ArrayList<Department>());
					}
					e2.getChildren().add(e1);
					break;
				}
			}
			if(!mark) tree.add(e1);
		}
		//转为json格式 
		//Collections.sort(tree);
		//this.sort(tree);
	
		String json = JSONArray.toJSONString(tree).toString();
		System.out.println("json:"+json);  
		long end = System.currentTimeMillis();
		long a = end -begin;
		System.err.println(a);
		return tree;
	}
	
	public void sort(List<Department> list){
		Collections.sort(list);
		for (Department department : list) {
			if(department.getChildren()!=null)
			this.sort(department.getChildren());
		}
	}
	
	public static void main(String[] args) {
		DepartmentService service = new DepartmentService();
		service.queryTree();
	}
	
}
