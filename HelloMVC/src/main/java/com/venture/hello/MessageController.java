package com.venture.hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.venture.pojo.Items;
import com.venture.pojo.Personal;

@Controller
public class MessageController {
	@ResponseBody
	@RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name,
    						@RequestParam(value="callback") String callback) {
		boolean jsonP = false;
		//String cb = request.getParameter("callback");
		String cb = callback;
         System.out.println("Hello " + cb);
         List<Personal> list = new ArrayList<Personal>();
 		Items items = new Items<Personal>();
	 		for (int i = 0; i <2; i++) {
	 			Personal p = new Personal("liwenqiang-"+i,"53462895-"+i,"13266699579-"+i);
	 			list.add(p);
	 		}
	 	items.setItems(list);
	 	//String jsonString = JSON.toJSONString(items);
	 	String jsonString ="{\"data\":[{\"email\":\"53462895-99\",\"name\":\"liwenqiang-0\",\"phone\":\"13266699579-0\"},{\"email\":\"53462895-1\",\"name\":\"liwenqiang-1\",\"phone\":\"13266699579-1\"}]}";
	 	 jsonString = cb + "(" +jsonString+");";
		 	//String jsonString = "{\"metaData\":{\"root\":\"rows\",\"id\":0,\"fields\":[{\"name\":\"employee_id\",\"header\":\"雇员ID\"},{\"name\":\"employee_name\",\"header\":\"姓名\"},{\"name\":\"receivable_month\",\"header\":\"应收年月\"},{\"name\":\"name0\",\"header\":\"产品1\"},{\"name\":\"name1\",\"header\":\"产品2\"},{\"name\":\"name2\",\"header\":\"产品3\"}]},\"rows\":[{\"employee_id\":3,\"employee_name\":\"张三\",\"receivable_month\":201010,\"name0\":33,\"name1\":11,\"name2\":22}]}";
		 	//jsonString = cb + "(" +jsonString+");";
	 	System.out.println(jsonString);
         return jsonString;  
    }

}
