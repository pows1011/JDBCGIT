package step1;

import java.util.Scanner;

public class Arr4 {

	public static void main(String[] args) {
		
		
		int [] a= new int[]{1,2,3,4,5,6,7,8,9,10};
		Scanner sc =new Scanner(System.in);
		System.out.println("�˻��� ���ڸ� �Է��ϼ���");
		int num=sc.nextInt();
		boolean flag=false;
		
		
		
		for(int i=0;i<a.length;i++) {
			if(num==a[i]) {
				System.out.println("��ġ�� �ε����� ���� :"+i);
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("ã�� ���� ����");
		}
		

	}

}
