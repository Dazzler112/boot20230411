package com.example.demo.domain;
//자바빈하고 똑같다(변수+기본생성자 + get/set메소드
public class Dto01 {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
}
