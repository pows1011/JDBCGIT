package step1;

import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		int i;
		int sum=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int a=sc.nextInt();
		
		for(i=1;i<=a;i++) {
			sum*=i;
			System.out.println("�ݺ�"+i+":"+sum+"*"+i+"="+sum);
		}
		System.out.println("���� : "+sum);

	}

}
