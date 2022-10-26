package test;

import java.util.Scanner;

import service.AddresService;
import vo.addres;

public class TestService {

	public static void main(String[] args) {

		AddresService service = new AddresService();	// ServiceŬ������ ����ϱ� ���� AddresServiceŬ������ �ν��Ͻ�(��ü)�� service�� ����
		Scanner sc = new Scanner(System.in);			// ��ĳ�ʻ�� �ϱ� ���� ��ü ����
		String name, tel, add;							// ���������� ������ ���Խ��� �ֱ� ���� ���� 3�� ����
		int i = 0;										// ����ġ�� ���� ������ ���� ����
		boolean flag = true;							// while���� �ݺ�����
		
		while (flag) {				
			System.out.println("1 �Է�");
			System.out.println("2 ��ü ���");
			System.out.println("3 �˻�");
			System.out.println("4 ����");
			System.out.println("5 ����");
			i = sc.nextInt();

			switch (i) {

			case 1:
				System.out.println("�̸�");
				name = sc.next();
				System.out.println("��ȭ��ȣ");
				tel = sc.next();
				System.out.println("�ּ�");
				add = sc.next();
				service.addPerson(new addres(name, tel, add));	//��ĳ�ʷ� �޾ƿ� 3���� ������ ServiceŬ������ addPerson�޼ҵ带 �ҷ��� addres�迭�� ���� ����

				break;

			case 2:
				service.printAll();				// ServiceŬ������ print�޼ҵ� ���
				break;
			case 3:
				System.out.println("�˻��� �̸� �Է�");
				name = sc.next();
				addres a = service.findPerson(name);		// addresŬ������ ����ϴ� a ������ �����ؼ� serviceŬ������ �˻��� ���� �޼ҵ��� ���� �Ѱ� �޴´�.
				System.out.println(a);						// a�� ���� ������� 16������ ����� ������ addres�� toString�޼ҵ尡 �������̵� �Ǿ��־� 16���� ���� 
				break;										// return�� ���� �Ǿ��ִ� ������ �������� �ȴ�.
			case 4:
				System.out.println("������ �̸� �Է�");
				name=sc.next();			
//				System.out.println("�ٲ� ��ȭ��ȣ");			//Main���� ��ĳ�ʷ� ���� �Է¹޾� ServiceŬ������ ������Ʈ �޼ҵ�� �Ѱ��ִ� ��� 
//				tel=sc.next();
//				System.out.println("�ٲ� �ּ�");
//				add=sc.next();
//				service.findUpdate(name, add, tel);
				service.findUpdate(name);				// Main�� ServiceŬ������ ������Ʈ �޼ҵ带 ���ุ �ϰ� ������Ʈ �޼ҵ� �ȿ��� ��ĳ�ʷ� ���� �Է¹޾� �װ��� ���������� ����
				break;
			case 5:
				flag = false;
				break;
			default:
				flag = false;
				break;

			}
		}
	}
}
