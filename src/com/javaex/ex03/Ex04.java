package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex04 {

	public static void main(String[] args) throws IOException {

		// 1) 주스트림
		Reader r = new FileReader("C:\\javaStudy\\file\\phoneDB.txt");

		// 2) 버퍼
		BufferedReader br = new BufferedReader(r);

		// 3) 읽어오기
		while (true) {
			String str = br.readLine(); // 한줄씩 읽어오기

			if (str == null) {
				break;
			}

			String[] sobj = str.split(","); // 배열에 담음

			String name = sobj[0];
			String hp = sobj[1];
			String company = sobj[2];

			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");

		}

		// 2) 닫기
		br.close();
	}

}
