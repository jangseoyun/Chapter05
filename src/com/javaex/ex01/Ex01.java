package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {// 공부 차원에서 다음에 오는얘가 처리하도록 다시 던짐

		// 빨대 메모리에 올리기(stream)
		// 예외처리 해줘야함, file이 없을 경우를 대비하여 try~catch문
		/*
		 * try { InputStream in = new
		 * FileInputStream("C:\\javaStudy\\file\\img.jpg");//생성자에 이미지 위치 정의 }catch
		 * (Exception e) { System.out.println("파일이 없습니다."); }
		 */

		// 1) 빨대 메모리에 올리기
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");// 생성자에 이미지 위치 정의(문자열로 받음)

		// 2) 출력 빨대 메모리에 올리기 
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");//파일 이름까지 출력할 경로 정의 (문자열로 받음) 
		
		//바이트(버퍼) 개념 추가 (쟁반) --> 적정값을 찾아야함 
		byte[] buff = new byte[1024]; //1024칸의 배열 쟁반 
		
		
		System.out.println("복사시작");
		
		//3) 버프 사용해서 읽어오기 반복 
		while(true) {
			int data = in.read(buff);//쟁반을 담아라 
			
			if(data == -1) {
				System.out.println("종료" + data);
				break;
			}
			out.write(buff);
		}
		
		/*
		// 1+2) 끝날때까지(-1일때까지) 읽어오기(반복해줘야함) 출력하기
		System.out.println("복사시작");
		//시간이 오래걸림 
		while (true) {
			int data = in.read();
			System.out.println(data);

			if (data == -1) { // -1이면 멈춰라
				System.out.println("복사완료"+data);
				break;
			}
			
			out.write(data);
		}*/
		

		in.close(); //빨대 회수 
		out.close();
	
	
	
	}

}
