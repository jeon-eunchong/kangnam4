package ch02;

public class IdentifierExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
//		String @myName = "홍길동";  /*- 특수문자 @로 시작*/
//		int #no = 27;    - 특스문자 #을사용
//		int !age =  30; - 특수문자 ! 사용

		String _name = "일지매"; // 정상 _변수명
		int $mony = 1000; // 정상 $변수명
//		특수문자에서 사용가능한 문자는 '$''_' 뿐이다.
//		int no# = 20;

		int mony$ = 25;

//		int 1stJob = 1;		// 숫자로 시작되는 변수명 안됨.
		int job1st = 1; // 정상

//		int my count = 10;    - my 와 count 사이에 공백이 있으면 안됨
//		int your 	turn = 2;  -your와 turn 사이에 tab만큼의 공백이 있으면 안됨.

//		길이에는 제한이 없음 ex)
//		변수명은 소문자로 시작 
//		단어와 단어가 합쳐진 합성어인 경우 합쳐지는 뒤 단어의 첫글자는 대문자로 나머지는 소문자로 표시 - 관례
		String myContryNameAndMycityNameAndMydongis = "대한민국서울강남";

//		변수선언
//		타입 변수명(식별자) = 값;
//	int ture = "참";         - ture/false 는 식별자로 사용불가
//	boolean false = "거짓";  -

//	String null ="아무것도 없다."; -null 도 식별자로 사용 불가

//		변수(식별자)는 대소문자를 구분함 Test 와 test는 전혀 다른 변수임.
		int Test = 10;
		int test = 20;

//		예약어
//		int for = 10;
//		사용가능
		int FOR = 20;
		
		
		
//		예약어
//		int for = 10;// 1100110 1101111 1110010 102 111  114
//		사용가능
//		int FOR = 20;//1001111 1010010   70 79 82
		
				
	}

}
