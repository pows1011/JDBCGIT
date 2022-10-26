package main;

import java.util.Scanner;

import service.PersonService;
import vo.Person;

public class PersonMain {

	public static void main(String[] args) {
	
		PersonService service=new PersonService();
		Scanner sc =new Scanner(System.in);
		int i=0;
		String name,age,tel,address;
		boolean flag=true;
		
		while(flag) {
			System.out.println("1. ���");
			System.out.println("2. ���");
			System.out.println("3. �˻�");
			System.out.println("4. ����");
			System.out.println("5. ����");
			i=sc.nextInt();
			
			switch(i) {
			
			case 1:
				System.out.println("����� �̸�");
				name=sc.next();
				System.out.println("����� ����");
				age=sc.next();
				System.out.println("����� ��ȭ��ȣ");
				tel=sc.next();
				System.out.println("����� �ּ�");
				address=sc.next();
				service.add(new Person(name, age, address, tel));
				break;
			case 2:
				service.printPer();
				break;
			case 3:
				System.out.println("�˻� �Ͻ÷��º��� �̸��� �Է��ϼ���");
				name=sc.next();
				Person p=service.search(name);
				System.out.println("�˻� �Ͻ� ������ : "+p);
				break;
			case 4:
				System.out.println("������ ���� �Ͻ÷��º��� �̸��� �Է��ϼ���");
				name=sc.next();
				service.edit(name);
				break;
			case 5:
				System.out.println("���� �մϴ�.");
				flag=false;
				break;
				default:
					flag=false;
					break;
			}
		}
		

	}

}
