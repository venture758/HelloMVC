package com.venture.redis;

import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;

public class SetTest {

	public static void main(String[] args) {
		/**SADD◦SCARD◦SDIFF◦SDIFFSTORE◦SINTER
		 * ◦SINTERSTORE◦SISMEMBER◦SMEMBERS◦SMOVE
		 * ◦SPOP◦SRANDMEMBER◦SREM◦SUNION◦SUNIONSTORE◦SSCAN
		 */

		Jedis jedis = new Jedis("192.168.1.114");
		String key ="setkey";
		jedis.sadd(key, "gug","gug1","gug2","a");
		ScanParams params = new ScanParams();
		params.match("a*");
		ScanResult<String> scanResult=jedis.sscan(key, 0,params);
		System.err.println(scanResult.getResult().get(0));
		String key2 = "Setkey2";
		jedis.sadd(key2, "gug3","gug");
		Set<String> set = jedis.sinter(key2,key);
		for (String string : set) {
			System.err.println("a:"+string);
		}
		System.err.println(jedis.smembers(key));
		System.err.println(jedis.spop(key2));
	}

}
