package com.tingna.springwebservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@ResponseBody를 모든 메소드에 적용 시켜줌
public class webRestController {
	@GetMapping("/hello")
	public String hello() { //hello 메소드의 결과는 "helloWorld"라는 문자열을 JSON형태로 반환
		return "HelloWorld";
	}
}
