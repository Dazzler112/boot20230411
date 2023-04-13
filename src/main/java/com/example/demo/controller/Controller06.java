package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("/sub6")
public class Controller06 {
	
	@RequestMapping("link1")
	public String method01() {//void를 String으로 사용하고
		System.out.println("link1 메소드 일함");
		return"forward:/sub6/link2"; //link1이 일하면서 link2에게 리턴해서 같이 출력됨
	}
	
	@RequestMapping("link2")
	public void method02() {
		System.out.println("link2 메소드 일함");
	}
	
	//경로 : /sub6/link3
	//method3 작성
	//forward /sub6/link2
	@RequestMapping("link3")
	public String method03() {
		System.out.println("link3 메소드 일함");
		//1.
		//2.
		//3.
		//4.forward
		return"forward:/sub6/link2";
	}
	
	@RequestMapping("link4")
	public void method4(HttpServletRequest req,HttpServletResponse res)throws Exception {
		
		System.out.println("link4에서 일함");
		
		String view = "/WEB-INF/views/abc.jsp";
		req.getRequestDispatcher(view).forward(req, res);

	}//servlet api 사용
	
	@RequestMapping("link5")
	public String method05() {
		System.out.println("link5에서 일함");
		
		return "forward:/WEB-INF/views/abc.jsp";
	}//spring 사용
	
	@RequestMapping("link6")
	public String method06() {
		System.out.println("link6 에서 일함");
		//src/main/resources/application.properties 에서 수정하면 아래처럼 경로 간결하게 가능
		return "abc";

	}
	
	//경로: /sub6/link7
	//method7작성
	//forward /WEB-INF/views/def.jsp
	
	@RequestMapping("link7")
	public String method07() {
		System.out.println("link7에서 일함");
		
		return"def";
		
	}
	
/*  Return Values 의 void항목      forward default view name            */	
	
	//경로 : /sub6/link8
	@RequestMapping("link8")
	public String method08() {
		System.out.println("8번 메소드 일함");
		//default view name : /sub6/link8
		return "/sub6/link8";
	}
	//String으로 리턴값 줘서 링크찾아가나
	@RequestMapping("link9")
	public void method09() {
		System.out.println("9번 메소드 일함");
		//default view name : /sub6/link9
	}//리턴값 안받는 void로 만들어서 그냥 쓰나 같나 void는 디폴트 값이 자기 RequestMapping이다
	//즉 void로 요청하지 않아도 return 값이 view 이름이 된다
	
	
	@RequestMapping("link10")
	public String method10() {
		System.out.println("link10 메소드 일함");
		return null; //forward default view name (리턴 값이 null이여도 위와 같다)
	}
	
	//예제
	//경로 : /sub6/link11
	//method11 작성
	// /WEB-INF/views/sub6/link11.jsp로 포워드
	/*
	@RequestMapping("link11")
	public String method11() {
		System.out.println("link11 메소드 일함");
		return "/sub6/link11.jsp";
	}
	
	@RequestMapping("link11")
	public String method11() {
		System.out.println("link11 메소드 일함");
		return null;
	}
	*/
	@RequestMapping("link11")
	public void method11() {
		System.out.println("link11 메소드 일함");
	} //대충 3가지 정도 있는대 더 많다고 함
	
	//경로 : /sub6/link12?name=park&age=33
	//method12작성
	//1.request param 수집/가공
	//2.business logic (생략)
	//3.add attribute(생략)
	//4. /WEB-INF/views/sub6/link12.jsp로 포워드
	@RequestMapping("link12")
	public void method12(String name, int age) {
		//끝이다 이게 저 1번,4번 다 한것이다 jsp에 비하면 편하지 않음?

	}
}
