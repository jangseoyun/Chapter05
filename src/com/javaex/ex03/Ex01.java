package com.javaex.ex03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException{
		//예외처리!! 해줘야한다. 수업에는 throws 처리 
		
		//1) writer 쓰는 빨대 준비 (스트림) --> 주스트림 업캐스팅
		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.txt");
		//1-1) 보조스트림 생성 (업캐스팅x) 
		BufferedWriter bw = new BufferedWriter(fw);
		
		//buffered로 컨트롤
		bw.write("학교종이 땡땡땡");
		bw.newLine(); //줄바꿈 --> 프로그램에 맞는 줄바꿈 기호로 컴파일해줌
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		
		bw.close();
	}

}
