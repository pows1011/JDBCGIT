package service;

import java.util.Scanner;

import vo.addres;

public class AddresService {					
	private int index;						//배열의 반복을 카운트해줄 변수 선언
	private addres a[] = new addres[10];	//10개의 저장공간을 가진 배열을 만듬

	
	public void addPerson(addres a) {		// 매개변수로 addres의 전역변수 모두를 받아오게 선언해주고 
		this.a[index] = a;					// this.a(DTO에 있는 필드의 속성값들)의 값을 현재 받아온 a의 값으로 대체
		index++;							// 배열의 카운트값을 ++증감 시켜줌
	}

	public void printAll() {				//반복문으로 index=배열의 숫자만큼 카운트 한 값까지 반복
		for (int i = 0; i < index; i++) {
			System.out.println(a[i]);		// 원래라면 a[i]의 값을 입력하면 16진수의 값이 나오지만 DTO의 toString의 return값이 출력되게된다 
											// toString은 오버라이드 되어있기 떄문에 어떠한 값에 대해 덮어쓰기 방식으로 적용되어 16진수가 원래의 값으로 바뀌게된것.
		}
	}

	public addres findPerson(String name) {		// 매개변수로 String name값을 메인에서 받아오고 
		addres ape = null;						// addres DTO 클래스의 변수를 밑에서 retrun값으로 넣기위해 선언해줌
												
		for (int i = 0; i < index; i++) {		//위와 마찬가지로 배열의 저장된 갯수만큼 반복 실행 
			if (a[i].getName().equals(name)) {	// a[i] < 배열의 값들중 getName의 값이 현재 매개변수를통해 받아온 name의 값과 동일하다면
				ape = a[i];						// ape에 현재의 배열이 저장하고 있는 값을 대입
			}

		}
		return ape;								// 조건에 맞는 값을 가진 배열의 주소값을 ape라는 변수에 담았고 그 변수를 return시켜줌

	}
	public addres findUpdate(String name) {	// 리턴값을 자료형이 아닌 클래스 방식으로  받음 매개변수는 name(수정에 필요한 이름)
		
		addres aup = findPerson(name);		// DTO클래스의 변수에 findPerson ( 검색을 위한 메소드 ) 의 값을 넣어준다
											// 검색을 실시하여 조건인 name과 맞는 값의 주소값을 리턴받아 aup안에 저장
		System.out.println(" 주소입력");		
		Scanner sc=new Scanner(System.in);	// 메소드 내부에서 스캐너 함수를 실행
		aup.setAdd(sc.next());				// set메소드를 사용하여 스캐너로 받아온 값을 위에서 받아온 배열의 주소값에 대입해준다
		System.out.println(" 번호입력");	
		aup.setTel(sc.next());			
		System.out.println("바뀐값:" +aup.getName()+" add="+aup.getAdd()+" tel="+aup.getTel());	
		return aup;
		
		
	}
	
//	public addres findUpdate(String name, String add, String tel) {
//		
//
//		addres aup = findPerson(name);	// DTO클래스의 변수에 findPerson ( 검색을 위한 메소드 ) 의 값을 넣어준다
//		aup.setAdd(add);				// 매개변수로 Main에서 add,tel,name의 값을 입력받고 그 값을 Set메소드로 위 검색에서 가져온
//		aup.setName(name);				// 배열의 방안에 값을 저장시킨다.
//		aup.setTel(tel);		
//		System.out.println("바뀐값:" +aup.getName()+" add="+aup.getAdd()+" tel="+aup.getTel());
//		return aup;
//	}

}
