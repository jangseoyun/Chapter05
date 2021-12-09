package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		// 포맷 범용
		// 이진수로 읽어오기
		InputStream is = new FileInputStream("C:\\javaStudy\\file\\phoneDB.txt");
		// 번역하기 ("포멧"문자열로 받음) 이진수로 읽고 해당 포맷으로 번역
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		// 버퍼
		BufferedReader br = new BufferedReader(isr);
		
		// 읽어오기
		while (true) {

			String str = br.readLine(); // 한줄씩 읽어옴

			// 한줄씩 읽는것이기 때문에 중간에 다른 코드 끼면 안됨
			// 우선 데이터 전체 받기
			if (str == null) {
				break;
			}

			String[] sobj = str.split(","); // 잘라서 배열에 넣기

			String name = sobj[0];
			String ph = sobj[1];
			String company = sobj[2];

			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + ph);
			System.out.println("회사: " + company);
			System.out.println("");
		}

		// 닫기
		br.close();

	}

}
