package com.zyx.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//全局捕获异常类，实现原理是spring aop的异常通知
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String,Object> resultError(){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("errorCode", 500);
		map.put("errorMsg", "系统错误！");
		return map;
	}

}
