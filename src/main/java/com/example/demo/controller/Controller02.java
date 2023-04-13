package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sub2") //요청 경로가 실행전까지 같을때 클래스레벨로 할수있음
public class Controller02 {
	
	@RequestMapping("/link1")
	public void method01() {
		System.out.println("/sub2/link1 에서 일하는 메소드!!");
	}
	@RequestMapping("/link2")
	public void method02() {
		System.out.println("/sub2/link2 에서 일하는 메소드!!");
	}
}
