package step1;

import java.util.Random;

public class lotto {

	public static void main(String[] args) {

		Random r=new Random();
		int [] lotto=new int[6]; // �迭 lotto���� �� 6���� ����
		
		//int num;
		
		
		for(int i=0; i <lotto.length; i++) { // 6���� �ݺ��� ����
			//num=r.nextInt(45)+1;
			lotto[i]=r.nextInt(45)+1; // ���� �� �̾ƿ��� 0~44������ �����ƴ� 1~45 ���� �ϱ����� +1
			for(int j=0;j<i;j++) {	// �ߺ����� lotto[i]�� 1�� �ݺ��ɵ��� j�� ������ �ݺ��ϸ� 
				if(/*num*/lotto[i]==lotto[j]) {	// lotto[0]~ lotto[j]�� ���ڱ��� ���� ���� �ִ��� üũ
					--i;			//�������� �����Ұ�� --i�� ���־� �ٷ� i�ǰ��� -1��Ű�� �ٽ� �� ��ġ�� ���� �޾ƿ�
				//num=r.nextInt(45)+1;
					//k=-1;
				}
			}//lotto[i]=num;
		}System.out.println("�ζ� ��ȣ ��÷");
		for(int i=0;i<lotto.length;i++) {	// ���� �ζǹ�ȣ�� �ݺ������� ���
			System.out.print((i+1)+"��°��ȣ="+lotto[i]+"\t");
		}
	}	

}
