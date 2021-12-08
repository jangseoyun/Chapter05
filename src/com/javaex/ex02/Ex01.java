package com.javaex.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		// 1) input
		// input 주 스트림 생성, 업캐스팅
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		// input buffered 보조 스트림 생성
		BufferedInputStream bin = new BufferedInputStream(in); // 업캐스팅 하지 않음,연결고리 ()인자 넣어줌

		// 2) output
		// output 주 스트림 생성, 업캐스팅
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\bufferedimg.jpg");
		// output buffered 보조 스트림 생성
		BufferedOutputStream bout = new BufferedOutputStream(out); // 업캐스팅 하지 않음, 연결고리 ()인자 넣어즘

		// 1+2) 읽고 출력하기
		while (true) {
			int data = bin.read(); // buffered로 컨트롤

			if (data == -1) {
				System.out.println("복사가 완료 되었습니다." + data);
				break;
			}

			bout.write(data);
		}

		// 빨대 빼줌! 프로그램에서 가장 가까운것이 컨트롤 buffered (맵 생각)
		bin.close();
		bout.close();

	}

}
