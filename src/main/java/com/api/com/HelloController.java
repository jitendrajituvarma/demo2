package com.api.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hi")
	public String hello() {
		return "this is demo project";
	}
	
	@GetMapping("/hello")
	public String hellobro() {
		return "this is this is bro project";
	}

}
