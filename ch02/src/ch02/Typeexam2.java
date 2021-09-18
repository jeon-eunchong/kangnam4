package ch02;

public class Typeexam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 10; //정수
		double y =15.2; // 실수

//		double타입의 변수y를
//		강제로 int 타입으로 타입변환 
//		(타입)변수
//		15.2 -> 15로 변환
//		실수에서 정수로 바꿔주는걸 형변환 -> casting 이라고함.
		int result = x + (int)y;//
		
		System.out.println(x+y); //실수
		System.out.println(result); //정수
	
	
	
	}

}
