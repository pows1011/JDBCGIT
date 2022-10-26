package service;

import java.util.Scanner;

import vo.addres;

public class AddresService {					
	private int index;						//�迭�� �ݺ��� ī��Ʈ���� ���� ����
	private addres a[] = new addres[10];	//10���� ��������� ���� �迭�� ����

	
	public void addPerson(addres a) {		// �Ű������� addres�� �������� ��θ� �޾ƿ��� �������ְ� 
		this.a[index] = a;					// this.a(DTO�� �ִ� �ʵ��� �Ӽ�����)�� ���� ���� �޾ƿ� a�� ������ ��ü
		index++;							// �迭�� ī��Ʈ���� ++���� ������
	}

	public void printAll() {				//�ݺ������� index=�迭�� ���ڸ�ŭ ī��Ʈ �� ������ �ݺ�
		for (int i = 0; i < index; i++) {
			System.out.println(a[i]);		// ������� a[i]�� ���� �Է��ϸ� 16������ ���� �������� DTO�� toString�� return���� ��µǰԵȴ� 
											// toString�� �������̵� �Ǿ��ֱ� ������ ��� ���� ���� ����� ������� ����Ǿ� 16������ ������ ������ �ٲ�ԵȰ�.
		}
	}

	public addres findPerson(String name) {		// �Ű������� String name���� ���ο��� �޾ƿ��� 
		addres ape = null;						// addres DTO Ŭ������ ������ �ؿ��� retrun������ �ֱ����� ��������
												
		for (int i = 0; i < index; i++) {		//���� ���������� �迭�� ����� ������ŭ �ݺ� ���� 
			if (a[i].getName().equals(name)) {	// a[i] < �迭�� ������ getName�� ���� ���� �Ű����������� �޾ƿ� name�� ���� �����ϴٸ�
				ape = a[i];						// ape�� ������ �迭�� �����ϰ� �ִ� ���� ����
			}

		}
		return ape;								// ���ǿ� �´� ���� ���� �迭�� �ּҰ��� ape��� ������ ��Ұ� �� ������ return������

	}
	public addres findUpdate(String name) {	// ���ϰ��� �ڷ����� �ƴ� Ŭ���� �������  ���� �Ű������� name(������ �ʿ��� �̸�)
		
		addres aup = findPerson(name);		// DTOŬ������ ������ findPerson ( �˻��� ���� �޼ҵ� ) �� ���� �־��ش�
											// �˻��� �ǽ��Ͽ� ������ name�� �´� ���� �ּҰ��� ���Ϲ޾� aup�ȿ� ����
		System.out.println(" �ּ��Է�");		
		Scanner sc=new Scanner(System.in);	// �޼ҵ� ���ο��� ��ĳ�� �Լ��� ����
		aup.setAdd(sc.next());				// set�޼ҵ带 ����Ͽ� ��ĳ�ʷ� �޾ƿ� ���� ������ �޾ƿ� �迭�� �ּҰ��� �������ش�
		System.out.println(" ��ȣ�Է�");	
		aup.setTel(sc.next());			
		System.out.println("�ٲﰪ:" +aup.getName()+" add="+aup.getAdd()+" tel="+aup.getTel());	
		return aup;
		
		
	}
	
//	public addres findUpdate(String name, String add, String tel) {
//		
//
//		addres aup = findPerson(name);	// DTOŬ������ ������ findPerson ( �˻��� ���� �޼ҵ� ) �� ���� �־��ش�
//		aup.setAdd(add);				// �Ű������� Main���� add,tel,name�� ���� �Է¹ް� �� ���� Set�޼ҵ�� �� �˻����� ������
//		aup.setName(name);				// �迭�� ��ȿ� ���� �����Ų��.
//		aup.setTel(tel);		
//		System.out.println("�ٲﰪ:" +aup.getName()+" add="+aup.getAdd()+" tel="+aup.getTel());
//		return aup;
//	}

}
