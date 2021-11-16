package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		int age = 15;
		//		//age가 0살 초과이고, 18살 미만 이면
		//		if(0 < age < 18) {
		//			System.out.println("청소년 입니다.");
		//		}
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요. \n나이: ");
		int age = sc.nextInt();
		if (0<age && age<18) {
			System.out.println("청소년 입니다.");
		}
		else {
			System.out.println("성인 입니다.");
		}



		sc.close();
	}

}
