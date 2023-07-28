package com.test.question;

public class Q018 {

	public static void main(String[] args) {
		int count = 0;
		count = positive(10);
		System.out.printf("양수: %d\n", count);
		
		count = positive(10, 20);
		System.out.printf("양수: %d\n", count);
		
		count = positive(10, 20, -30);
		System.out.printf("양수: %d\n", count);
		
		count = positive(10, 20, -30, 40);
		System.out.printf("양수: %d\n", count);
		
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수: %d\n", count);
		
	}//main
	public static int positive(int num1) {
		
		int count = 0 ;
		
		count += (num1 > 0) ? 1: 0;
		
		return count;
		
	}
	public static int positive(int num1, int num2) {
		int count = 0 ;
		
		count +=(num1 > 0) ? 1: 0;
		count +=(num2 > 0) ? 1 :0 ;
		
		return count;
	}

	public static int positive(int num1, int num2, int num3) {
		int count = 0 ;
		
		count +=(num1 > 0) ? 1: 0;
		count +=(num2 > 0) ? 1 :0 ;
		count +=(num3 > 0) ? 1 :0 ;
		
		return count;
	}
	public static int positive(int num1, int num2, int num3, int num4) {
		int count = 0 ;
		
		count +=(num1 > 0) ? 1: 0;
		count +=(num2 > 0) ? 1 :0 ;
		count +=(num3 > 0) ? 1 :0 ;
		count +=(num4 > 0) ? 1 :0 ;
		
		return count;	
	}
	public static int positive(int num1, int num2, int num3, int num4, int num5) {
		
int count = 0 ;
		
		count +=(num1 > 0) ? 1: 0;
		count +=(num2 > 0) ? 1 :0 ;
		count +=(num3 > 0) ? 1 :0 ;
		count +=(num4 > 0) ? 1 :0 ;
		count +=(num5 > 0) ? 1 :0 ;
		
		return count;	
	}

}
