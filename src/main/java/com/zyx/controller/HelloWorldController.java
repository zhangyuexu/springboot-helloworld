package com.zyx.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 微服务架构SpringCloud主要做rpc远程调用工作，用到的协议是http协议+restful风格+走json格式进行传输，SpringCloud核心依赖组件是SpringBoot,
 * SpringBoot又依赖web组件springmvc，所以以后只要看到写SpringCloud接口的时候，都是在写springmvc即写controller
 * 
 */

//这个注解表示运行前开始给你注入spring容器+创建tomcat+spring加载
@EnableAutoConfiguration
//@RestController表示该接口都全部返回json格式的
@RestController
public class HelloWorldController {
	
	@RequestMapping("/index")
	public String index() {
		return "success";
	}
	//如果在spring中要返回json格式，就得在方法前加@ResponseBody
	@RequestMapping("/getMap")
	public Map<String,Object> getMap(){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("errcode", 200);
		map.put("errmsg", "成功");
		return map;
	}

	public static void main(String[] args) {
		// 主函数运行springboot项目
		SpringApplication.run(HelloWorldController.class, args);

	}

}
