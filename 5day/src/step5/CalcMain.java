package step5;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {

		Calc c = new Calc();						//main���� �޾ƿ� ���� ����or�̿� ���� CalcŬ������ C��� ��ü(�ν��Ͻ�)�� �ּҰ��� �����
		Scanner sc = new Scanner(System.in);		//��ĳ�� �޾ƿ� sc��ü ����
		int x;										//��ĳ�ʿ��� �Է¹��� ���ڰ��� ������ ���� 2�� ����
		int y;										
		int i = 0;									//while���� �޴��ʵ忡�� �ݺ����� ������ �޴��κ��� ������ ����ϴ� ���ڸ� �޾ƿ� ��������
		boolean flag = true;						//while���� �ݺ����� (���̶�� �ݺ�) �� �����ϱ����� boolean

		while (flag) {
			System.out.println("1���ϱ�");
			System.out.println("2����");
			System.out.println("3���ϱ�");		
			System.out.println("4������");
			System.out.println("5����");
			i = sc.nextInt();						//���� ������ i���� �޴������� ���� �Է¹���

			switch (i) {
			case 1:
				System.out.println("���� �ΰ��� ���� �Է�");
				x=sc.nextInt();
				y=sc.nextInt();
				System.out.println(x+"+"+y+"="+c.add(x, y));
				break;
			case 2:
				
				System.out.println("�� �ΰ��� ���� �Է�");
				x=sc.nextInt();
				y=sc.nextInt();
				System.out.println(x+"-"+y+"="+c.sub(x, y));
				break;
			case 3:
				System.out.println("���� �ΰ��� ���� �Է�");
				x=sc.nextInt();
				y=sc.nextInt();
				System.out.println(x+"*"+y+"="+c.mul(x, y));
				break;
			case 4:
				System.out.println("������ �� �ΰ��� ���� �Է�");
				x=sc.nextInt();
				y=sc.nextInt();
				System.out.println(x+"/"+y+"="+c.div(x, y));
				break;
			case 5:
				System.out.println("����˴ϴ�");
				flag=false;
				break;
			default:
				System.out.println("�߸��� ���� �Է�");
				flag=false;
				break;

			}
		}

	}

}
