package step1;

import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		int i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���Ұ��� �Է����ּ���(2 ~ 9) : ");
		int a=sc.nextInt();
		
		if(a>=2&&a<=9) {
			
		for(i=1;i<=9;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}

	}else {
		System.out.println("���� �߸��Ǿ����ϴ�");
	}
		
	}

}
