package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub7")
public class Controller07 {

	
	@RequestMapping("link1")
	public void method01(HttpServletRequest req) {
		//1.
		//2.
		//3. add attribute
		req.setAttribute("myName", "서태웅");
		// /WEB-INF/views/sub7/link1.jsp로 포워드
	}//servlet 사용했을때
	
	@RequestMapping("link2")
	public String method02(Model model) {
		
		//3.add attribute
		model.addAttribute("myName", "채치수");
		
		//4.forward / redirect
		return "/sub7/link1";
	}
	
	//경로 : /sub7/link3
	//method3 작성
	// /WEB-INF/views/sub7/link3.jsp로 포워드
	
	@RequestMapping("link3")
	public String method03(Model model) {
		model.addAttribute("address" ,"독도");
		return "/sub7/link3";
	}
	
	@RequestMapping("link4")
	public void method04(Model model) {
		model.addAttribute("list",List.of("java","spring"));

	}
	
	
	//view>sub7폴더의 link5.jsp와 연동
	@RequestMapping("link5")
	public void method05(Model model) {
		model.addAttribute("myMap",Map.of("address","london" , "age" ,"32" , "email" , "son@gmail.com" ));

	}
	
	@RequestMapping("link6")
	public void method06(Model model) {
		model.addAttribute("name","이한나");
		model.addAttribute("job","매니저");
		model.addAttribute("hobby",List.of("영화","독서","TV"));
	}
	
	//예제 link7.jsp와 연계
	
	@RequestMapping("link7")
	public void method07(Model model) {
		model.addAttribute("age", 24);
		model.addAttribute("country" ,"tokyo");
		model.addAttribute("movieList",List.of("slamdunk","avatar","topgun"));

	}
	
	
	//자바빈(DTO 사용)
	@RequestMapping("link8")
	public void method08(Model model) {
		Dto01 o1 = new Dto01();
		o1.setName("박지성");
		o1.setAge(40);
		
		model.addAttribute("player", o1);
	}
	
	//예제
	//method9 작성
	//Dto02클래스 작성
	//경로 : /sub7/link9 로 요청 오면
	//Dto02 객체 만들어서 model에 attribute로 추가
	//view : /sub7/link9로 포워드
	
	@RequestMapping("link9")
	public void method9(Model model) {
		Dto02 d1 = new Dto02();
		d1.setModel("모닝");
		d1.setPrice(10000000);
		d1.setCompany("현대");
		
		model.addAttribute("value",d1);
	}
	
	@RequestMapping("link10")
	public void method10(Model model) {
		Dto04 obj = new Dto04();
		obj.setName("송태섭");
		obj.setAge(20);
		
		model.addAttribute("val",obj);
	}
}
