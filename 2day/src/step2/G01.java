 package step2;

public class G01 {

	public static void main(String[] args) {
		
		
		//�Ϲݹ迭
		//������ Ÿ���� ������ �������� �����͸� �����Ҽ� �ִ� ������ ����� ��

		
		//�ѹ� �Ҵ��� ������ ���̴� ���� �Һ�
		int[]score=new int[5]; //�迭�� ����
		//������[0][1][2][3][4]
		score[0]=95;
		score[1]=70;
		score[2]=80;
		score[3]=75;
		score[4]=100;
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"th score["+i+"]"+score[i]);
		}
		
		int []month= {31,28,31,31,30,30,30,30,30,30,30,30,30};
		
		for(int i=0;i<12;i++) {
			System.out.println((i+1)+"th month["+i+"]"+month[i]);
		}
		
		
		int total=0;
		double ave = 0;
		int[]score2= {95,70,80,75,100};
		for(int i=0;i<5;i++) {
			total+=score2[i];
			ave=(double)total/5;
		}System.out.println("����:"+total+"  �������:"+ave);
			
		
		
		double[]data= {9.5,7.0,13.6,7.5,10.0};
		double max,min;
		max=data[0];
		min=data[0];
		for(int i=0;i<5;i++) {
			
			if(max<data[i]) {
				
				max=data[i];
				
			}else if(min>data[i]) {
				min=data[i];
			}
			
		}System.out.println("�ִ�:"+max);
		System.out.println("�ּҰ�:"+min);
	
	}
	

	
	}
