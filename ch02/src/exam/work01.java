package exam;

public class work01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* ü���淮 ������
		 *  ü������ = ������ - ü���淮;
		 *  ����ǥ�� ü���淮 = (1.10*ü��kg) - (128*(ü��kg^2/Űcm^2))
		 *  ü�� 75kg, Ű 175 �� ������ ǥ�� ü���淮�� ���Դϱ�? 
		 *  	!!!���� ü����� ���ϱ�!!!
		 */
			final double ST1 = 1.10; 
			final int ST2 = 128;
			
			int weight = 75;	//ü��
			int height = 175;	//Ű
			double x1 = ST1*weight;  //1.10 * ü��
			int ww = weight*weight;	 //ü�� * ü��
			int hh = height*height;  // Ű * Ű
			
			double w1 = (weight*weight)/(height*height); // (ü��*ü��)/(Ű*Ű)
			
			double result = ST1*weight - (ST2*(weight*weight)/(double)(height*height));
			//(1.10*Ű) - (128*(ü��*ü��)/(Ű*Ű)) 
			System.out.println(result); //�����.
			
			
			//ü���淮 ���ϱ�
			double result2 = weight - result;
			
			System.out.println(result2);
			
			
			//ü����� ���ϱ� = ü���淮*100/ü��
			final double ST3 = 100;
			
			double result3 = result2 * ST3 / weight;
			
			System.out.println(result3);
			
	}

}
