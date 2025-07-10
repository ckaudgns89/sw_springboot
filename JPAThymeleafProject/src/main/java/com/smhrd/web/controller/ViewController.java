package com.smhrd.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	// 단순한 화면만 띄우는 컨트롤러
	@GetMapping("/")
	private String login() {
		return "login";
	}
	@GetMapping("/join")
	private String join() {
		return "join";
	}
	
	@GetMapping("/main")
	public String main() {
		return "main";
	}
}
