package step1;

import java.util.Random;

public class TestRandom {
	
	
	public static void main(String[] args) {
	
		Random r=new Random();//�޸��� ��ġ���� ��
		
		int i=r.nextInt(3);//0~2������ ���� �߻�
		System.out.println(i);
		for(int j=0;j<10;j++) {
			i=r.nextInt(45)+1;// 0~45 ���� ������ ���
			System.out.print(i);
		}
		
		
		

	}

}
