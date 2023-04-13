package com.example.demo.controller;

import org.springframework.stereotype.*;
// /sub3/link1
///sub3/link2
//하나의 컨트롤러(Controller03)에 내에 각 메소드 만들기
//공통된 링크 앞부분은 클래스에 명시
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/sub3")
public class Controller03Ex {
	
	//spring 
	
	@RequestMapping("/link1")
	public void control01() {
		System.out.println("/link1번 컨트롤이 작업중!!!");
	}
	
	@RequestMapping("/link2")
	public void control02() {
		System.out.println("/link2번 컨트롤이 작업중@@@");
	}
}
