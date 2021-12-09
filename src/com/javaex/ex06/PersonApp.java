package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) throws IOException {

		String name;
		String ph;
		String company;

		// 1. 리스트 메모리에 생성
		List<Person> pList = new ArrayList<Person>();

		// 2. 파일 프로그램으로 가져오기
		Reader r = new FileReader("C:\\javaStudy\\file\\phoneDB.txt");
		BufferedReader br = new BufferedReader(r);

		// 3. 읽기
		while (true) {

			String line = br.readLine();// 한줄씩 읽기

			if (line == null) {
				break;
			}

			String[] dArray = line.split(",");// 나눠서 배열에 넣기

			name = dArray[0];
			ph = dArray[1];
			company = dArray[2];

			// 4. 객체 생성
			Person person = new Person(name, ph, company);

			// 5. 리스트에 담기
			pList.add(person);

		}

		// 6. scanner로 데이터 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("추가 데이터를 입력하세요");
		String data = sc.nextLine();

		// 7. 데이터 나눠서 넣기
		String[] pAdd = data.split(",");
		name = pAdd[0];
		ph = pAdd[1];
		company = pAdd[2];

		// 8. 객체 생성 후 리스트에 추가 담기
		Person person02 = new Person(name, ph, company);
		pList.add(person02);

		// ★★9. 내보내기 -->내보낼 빨대가 필요할 때 꼽을 것! 아니면 바로 나가는것 실행
		Writer w = new FileWriter("C:\\javaStudy\\file\\phoneDB.txt");
		BufferedWriter bw = new BufferedWriter(w);

		//10. 리스트를 출력(리스트에 내용이 담겨져있기 때문에)!!! 하나씩 출력
		for (int i = 0; i < pList.size(); i++) {
			bw.write(pList.get(i).showinfo());
			bw.newLine();
		}

		// 2. 닫기
		br.close();
		bw.close();

		sc.close();
	}

}
