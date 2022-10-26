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
		System.out.println("변경 하실 나이 값 입력");
		ped.setAge(sc.next());
		System.out.println("변경 하실 주소 값 입력");
		ped.setAddress(sc.next());
		System.out.println("변경 하실 전화번호 값 입력");
		ped.setTel(sc.next());
		System.out.println("변경된 값 확인 이름 : "+ped.getName()+" 나이 :"+ped.getAge()+" 주소지 :"+ped.getAddress()+" 전화번호:"+ped.getTel());
		return ped;
		
	}
	
}
