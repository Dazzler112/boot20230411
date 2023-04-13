package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.*;

@Controller
@RequestMapping("sub4")
public class Controller04 {
	//method argument(parameter)
	
	@RequestMapping("link1")
	public void method1(ServletRequest request) {
					//리퀘스트를 명시해놓으면 파라미터 꺼내서 볼수있다!
		
		//1. request parameter 수집/가공  //순서는 jsp와 똑같다
		
		//경로 : /sub4/link1?name=손&age=30 //이경우엔 get방식으로 보내면 된다
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		//2. business logic
		
		//3. add attribute
		
		//4. forward/redirect
	}
	
	//경로 : /sub4/link2?address=seoul&email=korea@gmail.com
	
	@RequestMapping("link2")
	public void method02(ServletRequest request) {
		//1. request parameter 수집/가공
		String address = request.getParameter("address");
		String email= request.getParameter("email");

		System.out.println("address: " + address );
		System.out.println("email: " + email);
		
		//2. business logic
		
		//3. add attribute
				
		//4. forward/redirect
	}
	
	
	//경로 : /sub/link3?address=seoul
	@RequestMapping("link3")
	public void method03(@RequestParam("address") String address) {
							//람다식 마냥 짧게도 가능
		//1. request parameter 수집/가공
		System.out.println("address: " + address);
		//1번과정을 많이 줄였다!
		
		//2. business logic
		
		//3. add attribute
						
		//4. forward/redirect
	}
	
	//경로 : /sub4/link4?age=99
	//로 요청 왔을때 age request 파람 출력하는 메소드 작성
	@RequestMapping("link4")
	public void method04(@RequestParam("age") String age) {
		System.out.println("age: " + age);
		
		int age = Integer.parseInt(age);
		
		System.out.println("int age: " + age);
//		이렇게 해줄 필요 없이 자동형변환 해준다 (자동형변환 가능한 문자열이면)
		
	}
	
	//경로 : /sub4/link5?score=80
	@RequestMapping("link5")
	public void method04(@RequestParam("score") int score) {
		System.out.println("score: " + score);
		
	}
	//경로 : /sub4/link6?email=son@gmail.com
	@RequestMapping("link6")
	public void method06(@RequestParam("email")String email) {
		System.out.println("email: " + email);

	}
	
	//경로 : /sub4/link7?age=33
	@RequestMapping("/link7")
	public void method07(@RequestParam("age")String age) {
		System.out.println("age: " + age);

	}
	
	//경로 : /sub4/link8?address=seoul
	@RequestMapping("link8")
	public void method08(String address) {//이렇게 써도 requestParam으로 간주하겠다
		//하지만 이렇게 사용시 너무 많이 생략돼서 가독성이 좋지 않다
		System.out.println(address);
	}
	
	//경로 : /sub4/link9?score=99.7
	@RequestMapping("link9")
	public void method09(double score) {
		System.out.println("score : " + score);
		//하지만 우린 배워왔으니 이렇게 써도 알겠구나 하니까 쓴다(?)
	}
}
