package ch03;

public class Exam03 {

	public static void main(String[] args) {
		
	/* ü���淮 ������
	 *  ü������ = ������ - ü���淮;
	 *  ����ǥ�� ü���淮 = (1.10*ü��kg) - (128*(ü��kg^2/Űcm^2))
	 *  ü�� 75kg, Ű 175 �� ������ ǥ�� ü���淮�� ���Դϱ�? 
	 */
		final double ST1 = 1.10;
		final int ST2 = 128;
		
		int weight = 75;
		int height = 175;
		double x1 = ST1*weight;
		int ww = weight*weight;
		int hh = height*height;
		
		System.out.println("ww:"+ww);
		System.out.println("hh:"+hh);
		double w1 = (weight*weight)/(height*height); 
//		����/���� -> ���� 0.1836734693877551 -> 0 
//		128*0 -> 0 => 0.0
		
		/*
		double x1 = ST1*weight;
		double w1 = (weight*weight)/(height*height);
		double w2 = ST2*w1;
				
				
		System.out.println("x1:"+x1);
		System.out.println("w1:"+w1);
		System.out.println("w2:"+w2);
		*/
		
//		���� / (�Ǽ�)���� -> ����/�Ǽ� -> �Ǽ�
		double result = ST1*weight - (ST2*(weight*weight)/(double)(height*height));
		System.out.println(result);
	
//			���� ü����� ���ϱ�
		
		
		int percent = 100;
		double C = ((result*percent)/weight);
		
		System.out.println(C);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

		
		
		
		
	}
	
}
