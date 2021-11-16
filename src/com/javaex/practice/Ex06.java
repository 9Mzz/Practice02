package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println();

		System.out.print("숫자 2개를 입력해주세요.\n숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();

		if (num1-num2>=0) {
			System.out.println("큰수: "+num1+"\t작은수: "+num2+"입니다.");
		}
		else {
			System.out.println("큰수: "+num2+"\t작은수: "+num1+"입니다.");
		}


		sc.close();
	}

}
