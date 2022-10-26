package test;

import java.util.Scanner;

import service.SchoolService;
import vo.MemberVO;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String id,name,tel,add;	//VO에 있는 값을 대신 입력 받아올 String 변수 4개 설정
		boolean flag=true;
		int i=0;
		
		
		SchoolService service=new SchoolService();
		
		while(flag) {
			System.out.println("1 등록");
			System.out.println("2 검색");
			System.out.println("3 전체출력");
			System.out.println("4 종료");
			i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("아이디 입력");
				id=sc.next();
				System.out.println("이름 입력");
				name=sc.next();
				System.out.println("전화번호 입력");
				tel=sc.next();
				System.out.println("주소 입력");
				add=sc.next(); 
				service.addPerson(new MemberVO(id, name, tel, add));	// Service클래스에 있는 addPerson메소드 실행 addPerson의 값을
																		// MemberVO에 있는 전역변수에 넣기위해 객체를 불러옴
				break;
				
			case 2:
				System.out.println("검색할 전화번호 입력");		
				tel=sc.next();
				MemberVO m=service.findPerson(tel);		//findPerson메소드는 출력시켜주는 방법이 없이 return값에 정보만 보내주는 기능이기 때문에
				System.out.println(m);					//자료형이 아닌 타입형 변수인 m을 선언하여 그 m 안에 return값을 저장
				break;
				
				
			case 3:
				service.printAll();						//service클래스의 printAll메소드 실행
				break;
			case 4: 
				flag=false;
				break;
				default:
					flag=false;
					break;
			}
		}
		
		

	}

}
