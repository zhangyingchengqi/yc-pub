package com.yc.demo.crbook.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexAction {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

}
