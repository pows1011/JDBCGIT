package step3;

class Animal{}
class Person extends Animal{}
class Dog extends Animal{}


public class TestPoly4 {

	public static void main(String[] args) {
		
		Animal a= new Person();
		/*
		 * instanceof 연산자 
		 * 객체의 타입을 비교하여 ture or false로 반환
		 * 단 is a 관계시 (상속관계:ex)사람은 동물이다.)에는
		 * true를 반환하므로 항상 자식부터 부모순으로 비교해야 한다.
		 * 
		 * */
		
		if(a instanceof Person)
			System.out.println("나는 사람이다.");
		if(a instanceof Dog)
			System.out.println("나는 개다.");
		if(a instanceof Animal)
			System.out.println("나는 동물이다.");
		
		
		
	}

}
