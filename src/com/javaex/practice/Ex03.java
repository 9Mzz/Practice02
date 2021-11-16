package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.\n나이: ");
		int age = sc.nextInt();

		if(age>20) {
			System.out.println("\"1번그룹\"");
		}
		else {
			System.out.println("\"1번그룹\"");
		}
		System.out.println("입니다.");
		sc.close();
	}

}
