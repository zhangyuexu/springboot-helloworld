package com.zyx.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class IndexController {
	
	@RequestMapping("/indexController")
	public String getIndex() {
		int i=1/0;
		return "this is index";
	}

}
