package com.venture.redis;

import redis.clients.jedis.BinaryClient.LIST_POSITION;
import redis.clients.jedis.Jedis;

public class ListTest {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.1.114");
		/**
		 *  BLPOP◦BRPOP◦BRPOPLPUSH
		 * ◦LINDEX◦LINSERT◦LLEN◦LPOP◦LPUSH◦LPUSHX◦LRANGE◦LREM◦LSET◦LTRIM
		 * ◦RPOP◦RPOPLPUSH◦RPUSH◦RPUSHX
		 */
		jedis.flushAll();
		String key ="ListKey";
		jedis.lpush(key, "1","2","3","1","1");
		System.err.println(jedis.lrange(key, 0, -1));
		jedis.lset(key, 2, "33");
		System.err.println(jedis.lindex(key, 2));
		jedis.linsert(key, LIST_POSITION.BEFORE, "1", "11");
		long size= jedis.llen(key);
		System.err.println("size"+size);
		for (int i = 0; i < size; i++) {
			jedis.rpoplpush(key, "ListKey2");
		}
		//System.err.println(jedis.rpop(key));
		//System.err.println(jedis.llen(key));
		//jedis.flushAll();
	}

}
