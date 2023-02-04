package com.chenmin.redissessiondemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

@SpringBootTest
class RedisSessionDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void test() throws UnknownHostException {
		String s = InetAddress.getLocalHost().getHostName();
		System.out.println(s);
	}

}
