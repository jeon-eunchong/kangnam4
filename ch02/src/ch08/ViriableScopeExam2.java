package ch08;

public class ViriableScopeExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main�޼ҵ� ���� if ������ ����� ���ú���
		int var1; // ���� �� �� �ʱ�ȭ
		
		if(true) {
			//main�޼ҵ� ���� if ������ ����� ���ú���
			int var2;
			int var3;
			var1=1; // �� ����
			//���� ������ �������� ����� ������ ���� ���� ������ ���� 
			//int var1;
		
		}

		while(true) {
			//main �޼ҵ� ���� while ������ ����� ���ú���
			int var3;
			int var2;
		
			//var2=5;
			break; // �ݺ����� ���������� �ϴ� ��ɾ�
		
		}
		System.out.println(var1);
//		System.out.println(var2); //if �׸񿡼��� ���⋚���� ���Ұ���
//		System.out.println(var3); //while �׸񿡼��� ���⶧���� ���Ұ���
	}

}
