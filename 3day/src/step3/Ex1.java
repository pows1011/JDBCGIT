package step3;

public class Ex1 {

	public static void main(String[] args) {
		
		// �� for ���� 1�� ������ �ؿ� for���� 3���� �ݺ��� �ϰԵ�
		for(int a=1;a<=2; a++) {
			for(int b=1;b<=3;b++) {
				System.out.print("a="+a+" b="+b+",\t");
			}
			System.out.println();
		}
		
		
		//
		for(int a=2;a<=9; a++) {
			for(int b=1;b<=9;b++) {
				System.out.print(a+"*"+b+"="+a*b+"\t");
				
			}System.out.println("");
			
		}
		
		
		
		
		
		int i,j;
		for(i=0;i<10;i++) {
			for(j=2;j<10;j++) {
				if(i==0) {
					System.out.print(j+"��\t");
				}else {
					System.out.print(j+"*"+i+"="+(j*i+"\t"));
				}
			}System.out.println();
		}
		
		
		for(int a=1;a<=3; a++) {
			for(int b=1;b<=5;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int a=0;a<=3; a++) {
			for(int b=0;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
