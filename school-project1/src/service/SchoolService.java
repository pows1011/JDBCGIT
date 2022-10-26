package service;

import vo.Person;

public class SchoolService{
	private int index;					//배열의 카운트를 담당할 변수 선언 ( private로 은닉성 ) 
	private Person p[]=new Person[10];	// 10개의 저장공간을 가진 Person클래스의 p객체(인스턴스)를 생성
		
	
	

	public void addPerson(Person p) { // Person클래스를 받아오는 add메소드 생성  => Person은 3개의 자식에게 extend(상속)되어 있기 때문에 
		this.p[index]=p;				// Person클래스 하나만 선언되었지만 자식객체에 있는 변수들에도 Super가 설정 되어 있기 떄문에 Main에서 값만 넘겨준다면
		index++;						// Person하나만으로 여러개의 클래스의 값들을 넣어 줄 수 있다.					
	}
	
	public void printAll() {			// 배열이 카운트 된 횟수 만큼 반복진행하며 배열의 저장공간 안에 들어있는 값들을 하나씩 출력 시켜준다.
		for(int i=0; i<index;i++) {
			System.out.println(p[i]);
		}
	}
	
	public Person findPerson(String tel) {	// Main에서 tel값을 매개변수로 받아와 Person클래스의 배열들을 하나하나씩 반복하며 getTel=Tel값을 가져온뒤
		Person pf=null;						// 각각의 Tel값과 매개변수의 Tel값을 비교하여 같다면 Person클래스 변수인 pf에 그 배열의 주소값을 넣어준다
		for(int i=0;i<index;i++) 
		
		{
			if(p[i].getTel().equals(tel)) {
				pf=p[i];
		}
			
				
			}
		
		return pf;
		
	}

	
	
		
	
	
	

	
	
	
}
