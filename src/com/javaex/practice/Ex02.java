package com.javaex.practice;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		다음 코드는 오류가 있습니다.
		//		int x = 0;
		//		//x가 0과 같으면
		//		if(x=0) {
		//			
		//			System.out.println("x는 0이다.");
		//		}
		Scanner sc = new Scanner (System.in);

		int x = 0;
		if (x==0) {
			System.out.println("x는 0이다.");
		}

		sc.close();
	}

}
