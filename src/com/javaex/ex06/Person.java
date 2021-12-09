package com.javaex.ex06;

public class Person {

	// 필드
	private String name;
	private String ph;
	private String company;

	// 생성자
	public Person() {
	}

	public Person(String name, String ph, String company) {
		super();
		this.name = name;
		this.ph = ph;
		this.company = company;
	}

	// 메소드 g,s

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getCompan() {
		return company;
	}

	public void setCompan(String compan) {
		this.company = compan;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", ph=" + ph + ", compan=" + company + "]";
	}
	
	public String showinfo() {
		return "이름: " + name + ", 핸드폰: " + ph + ", 회사: " + company ;
		
	}
	
}
