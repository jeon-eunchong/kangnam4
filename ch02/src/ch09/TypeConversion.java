package ch09;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		int i = 100;
		
		System.out.println(b+1); // 127(byte) + 100(int) => 127(int) +100(int) 227
		
		System.out.println(10/4); // ����/���� -> �Ǽ�
		
		System.out.println((char)0x12340041); //A
		
		System.out.println((byte)(b+i)); //�����÷ο�
		
		System.out.println((int)2.9+1.8);  //���� + �Ǽ�-> �Ǽ�
		
		//(int)(2.9+1.8)
		//(int)(4.7)
		//4
		System.out.println((int)(2.9+1.8));// 4.7 => 4
				
	}

}
