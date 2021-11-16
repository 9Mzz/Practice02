package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키와 몸무게를 입력해주세요.\n키: ");
		double hei = sc.nextDouble();
		System.out.print("몸무게: ");
		double wei = sc.nextDouble();

		double value = ((hei-100)*0.9);

		if (wei==value) {
			System.out.println("표준 입니다.");
		}
		else if (wei>value) {
			System.out.println("과체중 입니다.");
		}
		else {
			System.out.println("저체중 입니다.");
		}
		System.out.println("표준체중: "+value);

		sc.close();
	}

}
