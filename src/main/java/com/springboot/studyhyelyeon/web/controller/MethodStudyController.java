package com.springboot.studyhyelyeon.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MethodStudyController {

	@GetMapping({"/", "index"})//GetMapping 적는 것이 요청주소(요청메세지)
	public String getMethod() {
		return "method/get";//"method/get" - 메소드 폴더안에 있는 get.html
	}
	
	@GetMapping("/test")
	public String getMethod2() {
		return "method/test";//"method/test" - 메소드 폴더안에 있는 test.html
	}
}
