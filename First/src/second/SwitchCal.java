package second;

import java.util.Scanner;

public class SwitchCal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a�� �Է����ּ��� : ");
		int a=sc.nextInt();
		System.out.println("b�� �Է����ּ��� : ");
		int b=sc.nextInt();
		System.out.println("�� ���� ����� ��ȣ�� �������ּ��� : ");
		String c=sc.next();
		
		switch(c) {
		
		case "+":
			System.out.println(a+"+"+b+"="+a+b);
			break;
		case "-":
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case "*":
			System.out.println(a+"*"+b+"="+a*b);
			break;
		case "/":
			System.out.println(a+"/"+b+"="+(float)a/b);
			break;
		case "%":
			System.out.println(a+"%"+b+"="+a%b);
			break;
			default:
				System.out.println("�߸��� ��ȣ�� �ԷµǾ����ϴ�.");
				break;
		}

	}

}
