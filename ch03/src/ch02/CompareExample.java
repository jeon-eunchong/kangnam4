package ch02;

public class CompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(3<5); //T
		System.out.println(3>5); //F
		System.out.println(1<=0);
		System.out.println(10>=10);
		System.out.println(1==3);
		System.out.println(1!=3);
		
		System.out.println(!(3<5));
		System.out.println((3<5)^(1==1));
		System.out.println((3>5)||(1==1));
		System.out.println((3<5)&&(1==1));
	}

}
