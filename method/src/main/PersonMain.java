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
			System.out.println("1. 등록");
			System.out.println("2. 출력");
			System.out.println("3. 검색");
			System.out.println("4. 수정");
			System.out.println("5. 종료");
			i=sc.nextInt();
			
			switch(i) {
			
			case 1:
				System.out.println("등록할 이름");
				name=sc.next();
				System.out.println("등록할 나이");
				age=sc.next();
				System.out.println("등록할 전화번호");
				tel=sc.next();
				System.out.println("등록할 주소");
				address=sc.next();
				service.add(new Person(name, age, address, tel));
				break;
			case 2:
				service.printPer();
				break;
			case 3:
				System.out.println("검색 하시려는분의 이름을 입력하세요");
				name=sc.next();
				Person p=service.search(name);
				System.out.println("검색 하신 정보는 : "+p);
				break;
			case 4:
				System.out.println("정보를 변경 하시려는분의 이름을 입력하세요");
				name=sc.next();
				service.edit(name);
				break;
			case 5:
				System.out.println("종료 합니다.");
				flag=false;
				break;
				default:
					flag=false;
					break;
			}
		}
		

	}

}
