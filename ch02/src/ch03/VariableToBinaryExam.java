package ch03;

public class VariableToBinaryExam {

	public static void main(String[] args) {

		int v1 =24; 
		long l2 = 24;
		
		System.out.println(ToBinary(v1));
		System.out.println(ToBinary1(24));
	}

	public static String ToBinary(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() <32) {
			str = "0" + str;
		}
		return str;
	}
	public static String ToBinary1(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() <64) {
			str = "0" + str;
		}
		return str;
	}
}
