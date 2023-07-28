package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {

	public static void main(String[] args) {
	
		/*
			요구사항] 여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다. 
				고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
			
			조건] 
			- 전화를 걸면 짜장면은 10분 뒤에 도착.
			- 전화를 걸면 치킨은 18분 뒤 도착.
			- 전화를 걸면 피자는 25분 뒤 도착.
			- 음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.(날짜변경 금지)
			
		*/
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("음식을 받기 원하는 시각");
		
		System.out.print("시: ");
		int hour = scan.nextInt();
		
		System.out.print("분: ");
		int minute = scan.nextInt();
		
		Calendar receiveHour = Calendar.getInstance();
		receiveHour.set(Calendar.HOUR_OF_DAY, hour);
		receiveHour.set(Calendar.MINUTE, minute);
		
		//가장 오래걸리는 피자를 만드는데 걸리는 시간이 25분이기 때문에 -10, -7, -8 을 배줌
		receiveHour.add(Calendar.MINUTE, -10);
		System.out.printf("짜장면: %d시 %d분\n"
						,(receiveHour.get(Calendar.HOUR_OF_DAY))
						, receiveHour.get(Calendar.MINUTE));
		
		receiveHour.add(Calendar.MINUTE, -7);
		System.out.printf("치킨 : %d시 %d분\n"
						,(receiveHour.get(Calendar.HOUR_OF_DAY))
						, receiveHour.get(Calendar.MINUTE));
		
		receiveHour.add(Calendar.MINUTE, -8);
		System.out.printf("피자 : %d시 %d분"
						,(receiveHour.get(Calendar.HOUR_OF_DAY))
						, receiveHour.get(Calendar.MINUTE));
		
		
	}//main

}
