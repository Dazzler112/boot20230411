package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub8")
public class Controller08 {
	
	@RequestMapping("link1")
	public String method01(@ModelAttribute("val")Dto04 dto04) {
					                         //타입 //아규먼트명
		dto04.setName("채소연");
		dto04.setAge(22);
		
		return"/sub7/link10";
		//이렇게 아규먼트에 넣으면 블록에서 Dto 인스턴스와 .add attribute생략해서 사용 가능하다
	}
	
	@RequestMapping("link2")
	public void method02(@ModelAttribute("product") Dto02 obj) {
		obj.setCompany("apple");
		obj.setModel("iapd");
		obj.setPrice(300);

	}
	
	@RequestMapping("link3")
	public void mathod03(Model model) {
		Dto02 dto02 = new Dto02();
		Dto03 dto03 = new Dto03();
		
		model.addAttribute("product",dto02);
		model.addAttribute("member",dto03);
	}//이것과 유사한거 아래
	
	//코드 안쓰고도 출력 가능
	@RequestMapping("link4")
	public void method04(@ModelAttribute("product")Dto02 dto02,
						@ModelAttribute("member")Dto03 dto03) {
		//3.add attribute
		//4.forward

	}
	
	//model attribute의 이름을 생략하면 클래스 이름을 lowerCamelCase
	
	//예) 클래스명 : 자바빈의 이름이 CompanyMember라면 -> companyMember
	@RequestMapping("link5")
	public void method05(@ModelAttribute("dto02")Dto02 dto02,
						@ModelAttribute("dto03")Dto03 dto03) {
		//3.add attribute
		dto02.setCompany("microsoft");
		dto03.setName("bill gates");
		//4.forward

	}
	@RequestMapping("link6")
	public String method06(@ModelAttribute Dto02 dto02,
						@ModelAttribute Dto03 dto03) {//@ModelAttribute의 어트리뷰트 생략 하면 클래스 네임을 따라간다
		//3.add attribute
		dto02.setCompany("apple");
		dto03.setName("steve jobs");
		//4.forward
		return "/sub8/link5";
	}
	
}
