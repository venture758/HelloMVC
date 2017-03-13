package com.venture.redis;

import redis.clients.jedis.BitOP;
import redis.clients.jedis.Jedis;

public class Test {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.1.114");
		String key="foo";
		jedis.mset("key","aa","bb","cc");
		jedis.setrange("bb", 1, "defg");
		System.err.println(jedis.get("bb"));
		System.err.println(jedis.getrange("bb", 1, 4));
		jedis.keys("*");
		jedis.setex("bb", 20, "aaaaa");
		System.err.println(jedis.ttl("bb"));
		jedis.psetex("key", 20000, "cccccccc");
		
		jedis.set(key, "256");
		System.err.println(jedis.bitcount(key));
		for (int i = 0; i < 8; i++) {
			System.err.println("bit:"+jedis.getbit(key, i));
		}
		System.err.println(jedis.get(key));
		jedis.set("key2", "3");
		System.err.println(jedis.bitop(BitOP.AND, "key3",key, "kye2"));
		System.err.println(jedis.get("key3"));
		
		System.err.println("=================");
		String bitkey = "bit1";
		jedis.setbit(bitkey, 100, "1");
		jedis.setbit(bitkey, 101, "0");
		jedis.setbit(bitkey, 102, "1");
		long size = jedis.strlen(bitkey);
		System.err.println(jedis.bitcount(bitkey));
		
		
		
	}
}
