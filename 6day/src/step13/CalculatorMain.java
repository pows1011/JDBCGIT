package step13;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		String a;
		int x=0,y=0;
		Calculator cal=new Calculator(0,0);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("����� ��ȣ�� �����ϼ���");
		a=sc.next();
		System.out.println("1���� �Է�");
		x=sc.nextInt();
		System.out.println("2���� �Է�");
		y=sc.nextInt();
		
		if(a.equals("+")) {
			System.out.println(cal.add(x,y));
		}else if(a.equals("-")) {
			
			System.out.println(cal.sub(x,y));
		}else if(a.equals("*")) {
			
			System.out.println(cal.mul(x,y));
		}else if(a.equals("/")) {
			
			System.out.println(cal.div(x,y));
		}else {
			System.out.println("�̻��� ��");
		}
	

	}

}
