package ch04;

public class LiteralCharExam1 {
	public static void main(String[] args) {
	
		char c1 = 'w';
		char c2 = 'A';
		char c3 = '가';
		char c4 = '*';
		char c5 = '3';
		char c6 = '글';
		//유니코드는 127번까지는 ASCII코드값과 같다.
		char c7 = '\u0041'; //유니코드 문자 4*16 + 1 = 
		char c8 = '\uae00';
		
		char h = '\uD64D';
		char g = '\uAE38';
		char d = '\uB3D9';
		System.out.println(h);
		System.out.println(g);
		System.out.println(d);
		
		//내이름으로 변환
		char j = '\uC804';
		char e = '\uC740';
		char c = '\uCD1D';
		System.out.println(j);
		System.out.println(e);
		System.out.println(c);
		
		
		
		
		
		System.out.println(c1);
		System.out.println(c2);		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		
		
	}
}
