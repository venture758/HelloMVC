package com.venture.pojo;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class TestJSON {

	public static void main(String[] args) {
		Group group = new Group();
		group.setId(0L);
		group.setName("admin");

		User guestUser = new User();
		guestUser.setId(2L);
		guestUser.setName("guest");

		User rootUser = new User();
		rootUser.setId(3L);
		rootUser.setName("root");

		group.addUser(guestUser);
		group.addUser(rootUser);

		String jsonString = JSON.toJSONString(group);
		
		List<Personal> list = new ArrayList<Personal>();
		
		Items items = new Items<Personal>();
		for (int i = 0; i <2; i++) {
			Personal p = new Personal("liwenqiang-"+i,"53462895-"+i,"13266699579-"+i);
			list.add(p);
		}
		items.setItems(list);
		String personaljsonString = JSON.toJSONString(items);
		System.out.println(personaljsonString);
		//System.out.println(jsonString);


	}

}
