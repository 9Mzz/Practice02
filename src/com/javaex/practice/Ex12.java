package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("출력되는 내용을 입력하세요. \n기호:");
		char val1 = sc.nextLine().charAt(0);
		System.out.println("숫자1: ");
		double num1 = sc.nextDouble();
		System.out.println("숫자2: ");
		double num2 = sc.nextDouble();

		double value;

		if (num2>0) {
			switch(val1) {
				case '+' : 
				value = num1+num2;
				System.out.println("결과는 "+(value)+"입니다.");
				break;

				case '-' :
				value = num1-num2;
				System.out.println("결과는 "+(value)+"입니다.");
				break;

				case '/' :
					if (num2==0 && num1==0) {
						System.out.println("계산할 수 없습니다.");
						break;
					}
					else {
						value = num1/num2;
						System.out.println("결과는 "+(value)+"입니다.");
						break;
					}
				
				case '*' :
					value = num1*num2;
				System.out.println("결과는 "+(value)+"입니다.");
				break;
				default : 
					System.out.println("계산할 수 없는 기호입니다.");
			}
		}


		sc.close();
	}
}
