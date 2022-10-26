package test;

import java.util.Scanner;

import service.AddresService;
import vo.addres;

public class TestService {

	public static void main(String[] args) {

		AddresService service = new AddresService();	// Service클래스를 사용하기 위해 AddresService클래스의 인스턴스(객체)인 service를 선언
		Scanner sc = new Scanner(System.in);			// 스캐너사용 하기 위한 객체 선언
		String name, tel, add;							// 전역변수의 값들을 대입시켜 주기 위한 변수 3개 선언
		int i = 0;										// 스위치문 구동 조건을 위한 변수
		boolean flag = true;							// while문의 반복조건
		
		while (flag) {				
			System.out.println("1 입력");
			System.out.println("2 전체 출력");
			System.out.println("3 검색");
			System.out.println("4 수정");
			System.out.println("5 종료");
			i = sc.nextInt();

			switch (i) {

			case 1:
				System.out.println("이름");
				name = sc.next();
				System.out.println("전화번호");
				tel = sc.next();
				System.out.println("주소");
				add = sc.next();
				service.addPerson(new addres(name, tel, add));	//스캐너로 받아온 3가지 값들을 Service클래스의 addPerson메소드를 불러와 addres배열에 값을 대입

				break;

			case 2:
				service.printAll();				// Service클래스의 print메소드 출력
				break;
			case 3:
				System.out.println("검색할 이름 입력");
				name = sc.next();
				addres a = service.findPerson(name);		// addres클래스를 사용하는 a 변수를 선언해서 service클래스의 검색을 위한 메소드의 값을 넘겨 받는다.
				System.out.println(a);						// a의 값이 원래라면 16진수로 출력이 되지만 addres의 toString메소드가 오버라이드 되어있어 16진수 값을 
				break;										// return에 설정 되어있는 값으로 덮어지게 된다.
			case 4:
				System.out.println("수정할 이름 입력");
				name=sc.next();			
//				System.out.println("바뀔 전화번호");			//Main에서 스캐너로 값을 입력받아 Service클래스의 업데이트 메소드로 넘겨주는 방식 
//				tel=sc.next();
//				System.out.println("바뀔 주소");
//				add=sc.next();
//				service.findUpdate(name, add, tel);
				service.findUpdate(name);				// Main은 Service클래스의 업데이트 메소드를 실행만 하고 업데이트 메소드 안에서 스캐너로 값을 입력받아 그값을 전역변수에 대입
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
