package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller  //control이라는 걸 명시하는 어노테이션
public class Controller01 {
	
	@RequestMapping("/sub1/link1") //이경로로 왔을때 이방식으로 일해야 한다
	public void method01() {
		System.out.println("일함!@!@!@!@!@");
	}
	
	//다른곳(경로)에 일하는 코드를 만들고싶은대 또 만들어야하냐? ㄴㄴ 메소드만 만들면 된다 아래처럼
	@RequestMapping("/sub1/link2")
	public void method02() {
		System.out.println("/sub1/link2 경로 요청에서 일하는 메소드!!");
	}
	
	@RequestMapping("/sub1/link3")
	public void method03() {
		System.out.println("/sub1/link3 에서 일하는 메소드$%^&*");
	}
}

