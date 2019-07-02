package com.zyx.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
//自动扫描指定的包
@ComponentScan("com.zyx.controller")
@EnableAutoConfiguration
public class App {

	/*
	 * springboot访问静态资源，默认去访问resources目录下的static目录，实现动静分离
	 * 所以访问静态资源直接访问静态资源就行，http://localhost:8080/d.png
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(App.class, args);

	}

}
