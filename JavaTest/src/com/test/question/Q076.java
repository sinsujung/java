package com.test.question;

import java.util.Scanner;

public class Q076 {
	
	public static void main(String[] args) {
		
		//요구사항] 성적을 입력받아 아래와 같이 출력하시오.
		/*
		 	조건] String[][] score = new String[10][3];
		 		국어 점수: 80 

				영어 점수: 50 

				수학 점수: 70
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int kor = scan.nextInt();

		System.out.print("영어 점수: ");
		int eng = scan.nextInt();
		
		System.out.print("수학 점수: ");
		int math = scan.nextInt();
		
		
		System.out.println("_____________");
		System.out.println(" 국어  영어  수학");
	}//main

}
