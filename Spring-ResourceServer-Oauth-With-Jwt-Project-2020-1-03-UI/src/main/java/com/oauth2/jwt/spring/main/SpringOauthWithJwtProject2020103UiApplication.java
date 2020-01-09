package com.oauth2.jwt.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.oauth2.jwt.spring.*" })
public class SpringOauthWithJwtProject2020103UiApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringOauthWithJwtProject2020103UiApplication.class, args);
	}
}
