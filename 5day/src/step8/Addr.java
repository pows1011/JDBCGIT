package step8;

import java.util.Scanner;

public class Addr {
	String name;	//Main에서 사용할 객체변수 선언
	String Tel;
	String address;
	
	void add(String name,String Tel,String address,Scanner sc) {
		System.out.println("이름값을 입력");
		this.name=sc.next();
		System.out.println("번호값입력");
		this.Tel=sc.next();
		System.out.println("주소값 입력");
		this.address=sc.next();
	}
	
	boolean search(String name) { // 검색에 사용할 search메소드 선언 main에서 매개변수 name으로 입력값 받아옴
		if(this.name.equals(name)) {		//클래스에 선언되어있는 name과 지역변수 매소드에서 입력받은 name값을 equal로 같은지 검사
			return true;		// 같다면 true값을 반환 
		}else {
			return false;
		}
		
	}
	

	void print() {
		System.out.print("이름:"+name);
		System.out.print(" 번호:"+Tel);
		System.out.print(" 주소:"+address);
		System.out.println();
		
	}

	boolean edit(String name,String Tel,String address) {
		
		boolean f;			//search에 name값을 입력시켜 그 값이 있는지 없는지에 따라 참 거짓 판단을 하기위함
		f=search(name);		// search메소드에 name매개변수의 인수를 할당시켜줌
		if(f==true) {		// f=true ( search가 됬다면 true 값을 반환하여 이 클래스(부모)의 Tel,Address값을 매개 변수에 입력된 인수로 변경
			this.Tel=Tel;	// 앞에있는건 클래스에 선언한 전역변수 뒤에 Tel은 지금Edit에서 생성한 지역변수 ( 매개변수로 받아온 Tel값을 전역변수 Tel에 대입하곘다)
			this.address=address;	//this 를 사용하면 전역변수 이클래스의 부모객체의 값을지정하는것 
		}
		
		
		
			return f;

	}

	

}
