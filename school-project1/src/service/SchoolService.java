package service;

import vo.Person;

public class SchoolService{
	private int index;					//�迭�� ī��Ʈ�� ����� ���� ���� ( private�� ���м� ) 
	private Person p[]=new Person[10];	// 10���� ��������� ���� PersonŬ������ p��ü(�ν��Ͻ�)�� ����
		
	
	

	public void addPerson(Person p) { // PersonŬ������ �޾ƿ��� add�޼ҵ� ����  => Person�� 3���� �ڽĿ��� extend(���)�Ǿ� �ֱ� ������ 
		this.p[index]=p;				// PersonŬ���� �ϳ��� ����Ǿ����� �ڽİ�ü�� �ִ� �����鿡�� Super�� ���� �Ǿ� �ֱ� ������ Main���� ���� �Ѱ��شٸ�
		index++;						// Person�ϳ������� �������� Ŭ������ ������ �־� �� �� �ִ�.					
	}
	
	public void printAll() {			// �迭�� ī��Ʈ �� Ƚ�� ��ŭ �ݺ������ϸ� �迭�� ������� �ȿ� ����ִ� ������ �ϳ��� ��� �����ش�.
		for(int i=0; i<index;i++) {
			System.out.println(p[i]);
		}
	}
	
	public Person findPerson(String tel) {	// Main���� tel���� �Ű������� �޾ƿ� PersonŬ������ �迭���� �ϳ��ϳ��� �ݺ��ϸ� getTel=Tel���� �����µ�
		Person pf=null;						// ������ Tel���� �Ű������� Tel���� ���Ͽ� ���ٸ� PersonŬ���� ������ pf�� �� �迭�� �ּҰ��� �־��ش�
		for(int i=0;i<index;i++) 
		
		{
			if(p[i].getTel().equals(tel)) {
				pf=p[i];
		}
			
				
			}
		
		return pf;
		
	}

	
	
		
	
	
	

	
	
	
}
