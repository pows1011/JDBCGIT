package step8;

import java.util.Scanner;

public class SchoolService {
	private int index;
	private MemberVO p[]=new MemberVO[10];
	
	public void addPerson(MemberVO p) {
		this.p[index]=p;
		index++;
		
	}
	public void printAll() {
		for(int i=0;i<index;i++) {
			System.out.println(p[i]);
		}
	}
	public MemberVO findPerson(String name) {
		MemberVO vo=null;
		for(int i=0;i<index;i++) {
			if(p[i].getName().equals(name)) {
				vo=p[i];
			}
		}return vo;
	}
	
	public MemberVO findUpdate(String name) {
		MemberVO vu=null;
		Scanner sc =new Scanner(System.in);
		vu=findPerson(name);
		System.out.println("수정할 주소");
		vu.setAddress(sc.next());
		System.out.println("수정할 부서");
		vu.setDept(sc.next());
		System.out.println("수정할 넘버");
		vu.setNum(sc.nextInt());
		return vu;
		
	}
	
	
	
}
