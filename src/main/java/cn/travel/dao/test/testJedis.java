package cn.travel.dao.test;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class testJedis {
		
		@Test
		public void testJedis() {
			Jedis jedis = new Jedis("127.0.0.1", 6379);
			jedis.set("name", "tom");
			String name = jedis.get("name");
			System.out.println(name);
			jedis.close();
		}
}
