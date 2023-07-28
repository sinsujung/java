package com.test.question;

public class Q017 {

	public static void main(String[] args) {
		
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동","유재석","박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
		
	}//main
	
	public static void position(String a1) {
		String m1 = "사원";
		System.out.printf("%s: %s\n",m1, a1);
		System.out.println();
	}
	
	public static void position(String a1, String a2) {
		String m1 = "사원";
		String m2 = "대리";
		
		System.out.printf("%s: %s\n%s: %s\n",m1, a1, m2, a2);
		System.out.println();
	}
	
	public static void position(String a1, String a2, String a3) {
		String m1 = "사원";
		String m2 = "대리";
		String m3 = "과장";
		
		System.out.printf("%s: %s\n%s: %s\n%s: %s\n",m1, a1, m2, a2, m3, a3);
		System.out.println( );
	}
	public static void position(String a1, String a2, String a3, String a4) {
		String m1 = "사원";
		String m2 = "대리";
		String m3 = "과장";
		String m4 = "부장";
		
		
		System.out.printf("%s: %s\n%s: %s\n%s: %s\n%s: %s\n",m1, a1, m2, a2, m3, a3, m4, a4);
		System.out.println( );
	}
}
