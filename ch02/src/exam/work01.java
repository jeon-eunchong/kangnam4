package exam;

public class work01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 체지방량 계산공식
		 *  체지방율 = 몸무게 - 체지방량;
		 *  남성표준 체지방량 = (1.10*체중kg) - (128*(체중kg^2/키cm^2))
		 *  체중 75kg, 키 175 인 남성의 표준 체지방량은 얼마입니까? 
		 *  	!!!과제 체지방률 구하기!!!
		 */
			final double ST1 = 1.10; 
			final int ST2 = 128;
			
			int weight = 75;	//체중
			int height = 175;	//키
			double x1 = ST1*weight;  //1.10 * 체중
			int ww = weight*weight;	 //체중 * 체중
			int hh = height*height;  // 키 * 키
			
			double w1 = (weight*weight)/(height*height); // (체중*체중)/(키*키)
			
			double result = ST1*weight - (ST2*(weight*weight)/(double)(height*height));
			//(1.10*키) - (128*(체중*체중)/(키*키)) 
			System.out.println(result); //결과값.
			
			
			//체지방량 구하기
			double result2 = weight - result;
			
			System.out.println(result2);
			
			
			//체지방률 구하기 = 체지방량*100/체중
			final double ST3 = 100;
			
			double result3 = result2 * ST3 / weight;
			
			System.out.println(result3);
			
	}

}
