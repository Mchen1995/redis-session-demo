package com.chenmin.redissessiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession  // 开启 redis session 管理
public class RedisSessionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSessionDemoApplication.class, args);
	}

}
