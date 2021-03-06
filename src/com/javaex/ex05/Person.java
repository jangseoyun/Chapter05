package com.javaex.ex05;

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
	
	public void showinfo() {
		System.out.println("이름: " + name);
		System.out.println("핸드폰: " + ph);
		System.out.println("회사: " + company);
		System.out.println("");
	}
}
