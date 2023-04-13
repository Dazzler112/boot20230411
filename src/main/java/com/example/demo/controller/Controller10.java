package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub10")
public class Controller10 {

	@RequestMapping("link1")
	public void method01(@RequestParam String name) {//<-- 이건 @RequestParam으로 인식
		//위의 어노테이션만 사용시 생략된것
		/*
		 String name = request.getParameter("name");
		 */

	}
	
	@RequestMapping("link2")
	public void method02(Dto04 dto) {//<-- 이건 @ModelAttribute으로 인식
		//위의 어노테이션만 사용시 생략된것
		/*
		Dto04 dto = new Dto04();
		dto.setName(request.getParameter("name"));
		dto.setAge(Integer.parseInt(request.getParameter("age"));
		
		request.setAttribute("dto04",dto);
		*/		
	}
	
	//경로 : /sub10/link3?model=ray&price=3.14&name=son&age=22
	@RequestMapping("link3")
	public void method03(@ModelAttribute("model")
						 String model,
						 @ModelAttribute("price")
						 double price,
						 Dto04 dto,
						 Model modelMap) {//Dto만 출력되고 나머지는 안된다
		/*
		modelMap.addAttribute("model",model);
		modelMap.addAttribute("price",price);
		//modelAttribute 어노테이션 쓰던지 이렇게 addAttribute를 하던지
		*/
	}
	
	@RequestMapping("link4")
	public void method4() {
		//1. request param 수집/가공
		
		//2.business logic
		//data 를 생성(create), 읽기(read), 수정(update),삭제(delete)
		//crud
		
		//3.add attribute
		//4.forward

	}
}
