package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp02 {

	public static void main(String[] args) throws IOException {
		
		// 1) 리스트 메모리 생성
		List<Person> pList = new ArrayList<Person>();

		// 2) 파일에서 데이터 읽기위해 스트림(빨대)
		Reader fr = new FileReader("C:\\javaStudy\\file\\phoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		// 3) 파일 읽어오기
		while (true) {

			String line = br.readLine(); // 1. 한줄씩 읽어오기(*주소를 넣는것)

			if (line == null) { // 2. 탈출조건 (null) 마지막이면 
				break;
			}
			
			//2. 마지막이 아닐경우
			String[] dArray = line.split(","); // 3.잘라서 배열에 넣기
			 
			//데이터를 변수에 주소만 넣어준다(부르기 쉽게)
			String name = dArray[0];
			String ph = dArray[1];
			String company = dArray[2];
			
			//4. 생성자에 넣어서 인스턴스화 
			Person p01 = new Person(name, ph, company);
			
			//5. ★리스트에 추가 
			pList.add(p01);
		}
		
		//테스트용 toString 출력
		//System.out.println(pList.toString());
		
		//6. 출력
		for(int i = 0; i<pList.size(); i++) {
			pList.get(i).showinfo();
		}

		// 2) 스트림 닫기
		br.close();
		
	}

}
