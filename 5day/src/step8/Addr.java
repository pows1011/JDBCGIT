package step8;

import java.util.Scanner;

public class Addr {
	String name;	//Main���� ����� ��ü���� ����
	String Tel;
	String address;
	
	void add(String name,String Tel,String address,Scanner sc) {
		System.out.println("�̸����� �Է�");
		this.name=sc.next();
		System.out.println("��ȣ���Է�");
		this.Tel=sc.next();
		System.out.println("�ּҰ� �Է�");
		this.address=sc.next();
	}
	
	boolean search(String name) { // �˻��� ����� search�޼ҵ� ���� main���� �Ű����� name���� �Է°� �޾ƿ�
		if(this.name.equals(name)) {		//Ŭ������ ����Ǿ��ִ� name�� �������� �żҵ忡�� �Է¹��� name���� equal�� ������ �˻�
			return true;		// ���ٸ� true���� ��ȯ 
		}else {
			return false;
		}
		
	}
	

	void print() {
		System.out.print("�̸�:"+name);
		System.out.print(" ��ȣ:"+Tel);
		System.out.print(" �ּ�:"+address);
		System.out.println();
		
	}

	boolean edit(String name,String Tel,String address) {
		
		boolean f;			//search�� name���� �Է½��� �� ���� �ִ��� �������� ���� �� ���� �Ǵ��� �ϱ�����
		f=search(name);		// search�޼ҵ忡 name�Ű������� �μ��� �Ҵ������
		if(f==true) {		// f=true ( search�� ��ٸ� true ���� ��ȯ�Ͽ� �� Ŭ����(�θ�)�� Tel,Address���� �Ű� ������ �Էµ� �μ��� ����
			this.Tel=Tel;	// �տ��ִ°� Ŭ������ ������ �������� �ڿ� Tel�� ����Edit���� ������ �������� ( �Ű������� �޾ƿ� Tel���� �������� Tel�� �����ρٴ�)
			this.address=address;	//this �� ����ϸ� �������� ��Ŭ������ �θ�ü�� ���������ϴ°� 
		}
		
		
		
			return f;

	}

	

}
