package com.test.question;

import java.util.Scanner;

public class Q081 {

	public static void main(String[] args) {
		
		//요구사항] 이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
		/*출력]
		 아이디: 아이디: hong
				도메인: gmail.com
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이메일: ");
		String email =scan.nextLine();
		
		int index = email.indexOf("@");
		
		System.out.println("아이디: " + email.substring(0, index));
		System.out.println("도메인: " + email.substring(index+1));
		
	}//main
}
