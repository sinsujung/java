package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {
	
	public static void main(String[] args) {
		
		/*요구사항
		배열의 요소를 순차적으로 2개씩 더한 
		결과를 배열로 생성한 뒤 출력하시오.
		
		조건..
		원본 배열 길이: 사용자 입력
		원본 배열 요소: 난수(1~9)
		결과 배열 길이: 사용자 입력 / 2
		 */
		
		Scanner scan = new Scanner(System.in);//스캐너 호출

		System.out.print("배열 길이: ");
		int input = scan.nextInt(); // 배열길이 입력 받기 

		int[] nums = new int[input]; 
		int[] sums	= new int[input/2]; //배열 선언 sums은 결과값 넣을것
		
		for (int i = 0; i < nums.length; i++) {
			int rnd = (int) (Math.random() * 9) + 1;
			nums[i] = rnd;//난수생성해서 numsㅂㅐ열에 넣기
		}
		for (int i = 0; i < nums.length - 1; i += 2) {
			// 배열 0번더하기 1번, 2번 더하기 3번 ...
			sums[i/2] = nums[i] + nums[i+1]; 
			//i는 nums 배열 길이보다 1 적게까지 돌리고 nums[i] + nums[i+1]해준다~
			
				 
			
		}
		System.out.print("원본: ");
		System.out.println(Arrays.toString(nums));
		System.out.print("결과: ");
		System.out.println(Arrays.toString(sums));

	}// main

}
