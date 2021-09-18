package ch09;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		int i = 100;
		
		System.out.println(b+1); // 127(byte) + 100(int) => 127(int) +100(int) 227
		System.out.println(10/4); // 정수/정수 -> 실수
		System.out.println((char)0x12340041); // 정수/실수-> 실수
		System.out.println((byte)(b+i)); //A
		System.out.println((int)2.9+1.8);//오버플로우
		System.out.println((int)(2.9+1.8));// 2 + 1.8 => 2.0 + 1.8 = 3.8
		System.out.println((int)2.9 + 1.8); // 4.7 => 4

		
		
	}

}
