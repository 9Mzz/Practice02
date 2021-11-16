package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		
		System.out.print("숫자: ");
		int x = sc.nextInt();
		
		double num1 = (x*x*x)-(9*x)+2;
		double num2 = (7*x)+2;
		
		if (x<=0) {
			System.out.println("계산결과는 "+num1+" 입니다.");
		}
		
		else {
			System.out.println("계산결과는 "+num2+" 입니다.");
		}
		
		
		
		sc.close();

	}

}