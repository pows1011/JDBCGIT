package service;

import java.util.Scanner;

import vo.Person;

public class PersonService {
	private int count;
	private Person per[]=new Person[10];
	
	public void add(Person p) {
		this.per[count]=p;
		count++;
	}
	public void printPer() {
		for(int i=0;i<count;i++) {
			System.out.println(per[i]);
		}
	}
	public Person search(String name) {
		Person pse=null;
		for(int i=0;i<count;i++) {
			if(per[i].getName().equals(name)) {
				pse=per[i];
			}
		}
		
		return pse;
	}
	public Person edit(String name) {
		Person ped=null;
		Scanner sc =new Scanner(System.in);
		ped=search(name);
		System.out.println("���� �Ͻ� ���� �� �Է�");
		ped.setAge(sc.next());
		System.out.println("���� �Ͻ� �ּ� �� �Է�");
		ped.setAddress(sc.next());
		System.out.println("���� �Ͻ� ��ȭ��ȣ �� �Է�");
		ped.setTel(sc.next());
		System.out.println("����� �� Ȯ�� �̸� : "+ped.getName()+" ���� :"+ped.getAge()+" �ּ��� :"+ped.getAddress()+" ��ȭ��ȣ:"+ped.getTel());
		return ped;
		
	}
	
}
