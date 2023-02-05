package com.chenmin.redissessiondemo.config;

import com.chenmin.redissessiondemo.controller.GreetController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import java.util.Objects;

@Configuration
@PropertySource("application.yml")
@EnableRedisHttpSession
public class SessionConfig {

    Logger logger = LoggerFactory.getLogger(GreetController.class);

    @Autowired
    private Environment env;

    @Bean
    public LettuceConnectionFactory connectionFactory() {
        RedisStandaloneConfiguration redisConf = new RedisStandaloneConfiguration();
        String host = Objects.requireNonNull(env.getProperty("spring.redis.host"));
        int port = Integer.parseInt(Objects.requireNonNull(env.getProperty("spring.redis.port")));
        logger.info("=== Reading Redis config, host: " + host + ", port: " + port + " ===");
        redisConf.setHostName(host);
        redisConf.setPort(port);
        return new LettuceConnectionFactory(redisConf);
    }
}
