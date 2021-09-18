package ch08;

public class ViriableScopeExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main메소드 내의 if 블럭에서 선언된 로컬변수
		int var1; // 선언 후 값 초기화
		
		if(true) {
			//main메소드 내의 if 블럭에서 선언된 로컬변수
			int var2;
			int var3;
			var1=1; // 값 변경
			//상위 범위의 블럭내에서 선언된 변수를 하위 범위 블럭에서 선언 
			//int var1;
		
		}

		while(true) {
			//main 메소드 내의 while 블럭에서 선언된 로컬변수
			int var3;
			int var2;
		
			//var2=5;
			break; // 반복문을 빠져나가게 하는 명령어
		
		}
		System.out.println(var1);
//		System.out.println(var2); //if 항목에서만 쓰기떄문에 사용불가능
//		System.out.println(var3); //while 항목에서만 쓰기때문에 사용불가능
	}

}
