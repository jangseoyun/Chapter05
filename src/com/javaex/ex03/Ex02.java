package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		// 1) Reader 문자를 읽어온다(빨대 꼽기)
		Reader fr = new FileReader("C:\\javaStudy\\file\\song.txt");//utf-8
		// 1-1) 보조 스트릠
		BufferedReader br = new BufferedReader(fr); // 주스트림 연결

		// 2) 텍스트 읽어오기(다 읽을때까지(null) 읽어와를 반복)
		while (true) {
			String str = br.readLine(); // 한줄씩 읽어옴 --> 줄바꿈 기회는 제외
			// 파일에서 한줄씩 읽어옴 (보이지 않지만 줄바꿈이 됨(줄바꿈 기호가 있는것))
			if (str == null) {
				break;
			}

			System.out.println(str);

		}

		// 1-2) 닫기
		br.close();

	}

}
