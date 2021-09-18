package ch02;

import java.util.Scanner;

public class ArithmeticExam3 {

	public static void main(String[] args) {
	
		int input = 10;
		Scanner scanner = new Scanner(System.in);
		//숫자를 키보드로 입력받아서 짝수/홀수
		System.out.println("정수를 입력하세요:");
		input = scanner.nextInt();
		
		if(input % 2==0) { //짝수 
			System.out.println("짝수");
		} else{
			System.out.println("홀수");
		}
	}

}
