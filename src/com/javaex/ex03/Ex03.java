package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		// 모든 포멧을 읽고 사용하게 하기 위해서
		// 1) 이진수를 읽어오는 주스트림 생성(빨대)
		InputStream is = new FileInputStream("C:\\javaStudy\\file\\MS949.txt");
		// 2) 보조 스트림 : 파일 포멧 파라미터로 정의해주면 글자로 해석
		InputStreamReader isr = new InputStreamReader(is, "MS949");
		// 3) 버퍼
		BufferedReader br = new BufferedReader(isr);

		// 4) 읽어오기
		while (true) {
			String str = br.readLine();// 한줄씩

			if (str == null) {
				break;
			}

			System.out.println(str);
		}

		// 3) 닫기

		br.close();

	}

}
