package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {

		String name;
		String ph;
		String company;
		
		InputStream is = new FileInputStream("C:\\javaStudy\\file\\phoneDB.txt");
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		//계속 꺼내서 쓸 수 있도록 하기 위해서 리스트로 관리
		List<Person> pList = new ArrayList<Person>();

		while (true) {

			String line = br.readLine();// line에 주소를 주는 것 

			if (line == null) {//반복이 될 때 값을 받는것의 null일때 그만하도록 하려면 reader뒤에 와야함, nullpoint에러 발생
				break;
			}

			String[] strArray = line.split(","); //strArray에 주소를 주는 것 

			name = strArray[0];
			ph = strArray[1];
			company = strArray[2];

			Person person = new Person(name, ph, company);
			pList.add(person);

		}
		
		//데이터 추가
		String me = "장서윤,010-2222-3333,헬로우"; //데이터 생성
		String[] myArray = me.split(","); //문단 나눠서 배열에 넣기 
		
		name = myArray[0];
		ph = myArray[1];
		company = myArray[2];
		
		Person myData = new Person(name, ph, company);
		pList.add(myData);

		for (Person plist : pList) {
			plist.showinfo();
		}

		br.close();

	}

}
