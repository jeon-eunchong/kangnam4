package ch02;

import java.util.Scanner;

public class ArithmeticExam3 {

	public static void main(String[] args) {
	
		int input = 10;
		Scanner scanner = new Scanner(System.in);
		//���ڸ� Ű����� �Է¹޾Ƽ� ¦��/Ȧ��
		System.out.println("������ �Է��ϼ���:");
		input = scanner.nextInt();
		
		if(input % 2==0) { //¦�� 
			System.out.println("¦��");
		} else{
			System.out.println("Ȧ��");
		}
	}

}
