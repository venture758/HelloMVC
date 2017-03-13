package com.venture.redis;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class HashTest {

	public static void main(String[] args) {
		System.err.println("hset key field value");
		Jedis jedis = new Jedis("192.168.1.114");
		String key="venture:hashkey1";
		String field = "field1";
		jedis.hset(key, field, "11");
		System.err.println(jedis.hget(key, field));
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "liwenqiang");
		map.put("age", "18");
		jedis.hmset(key, map);
		 Map<String,String> keyvalue = jedis.hgetAll(key);
		 
		 System.err.println("=========");
		 jedis.hsetnx(key, "ww", "dd");
		 jedis.hdel(key, "gender","ww","field1","fffff");
		 System.err.println(jedis.hgetAll(key));
		 System.err.println(jedis.hkeys(key));
		 System.err.println(jedis.hvals(key));
		 System.err.println(jedis.hlen(key));
		
	}

}
