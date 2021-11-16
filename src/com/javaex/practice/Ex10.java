package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("사번(점수)를 입력해주세요.\n사번: ");
		int num1 = sc.nextInt();
		int num2;

		if(num1>=0) {
			if (num1%3==0) {
				System.out.println("A팀입니다."); 
			}
			else if (num1%3==1) {
				System.out.println("B팀입니다.");
			}
			else {
				System.out.println("C팀입니다.");
			}
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}

		sc.close();
	}

}
