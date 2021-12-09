package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		// 포맷 범용
		// 이진수로 읽어오기
		InputStream is = new FileInputStream("C:\\javaStudy\\file\\phoneDB.txt");
		// 번역하기 ("포멧"문자열로 받음) 이진수로 읽고 해당 포맷으로 번역
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		// 버퍼
		BufferedReader br = new BufferedReader(isr);
		// 리스트 생성
		List<String> phList = new ArrayList<String>();

		// 읽어오기
		while (true) {
			
			//String 클래스 
			String line = br.readLine(); // 한줄씩 읽어옴

			// 한줄씩 읽는것이기 때문에 중간에 다른 코드 끼면 안됨
			// 우선 데이터 전체 받기
			if (line == null) {
				break;
			}

			String[] sArray = line.split(","); // 잘라서 배열에 넣기

			String name = sArray[0];
			String ph = sArray[1];
			String companyph = sArray[2];

			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + ph);
			System.out.println("회사: " + companyph);
			System.out.println("");
		}

		// 닫기
		br.close();

	}

}
