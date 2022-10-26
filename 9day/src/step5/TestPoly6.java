package step5;

class Vehicle{
	
	public void go() {
		System.out.println("가다");
	}
}
class Car extends Vehicle{
	public void go() {
		System.out.println("자동차가 가다");
	}
}

class Airplane extends Vehicle{
	public void go() {
		System.out.println("비행기가 가다");
	}
	
	public void fly() {
		System.out.println("비행기가 날아가다");
	}
}



public class TestPoly6 {

	public static void main(String[] args) {
		
		//다형성이 적용되므로  Vehicle 부모타입의 배열에 자식 객체 요소를 추가 가능
		Vehicle va[]= {new Vehicle(),new Car(),new Airplane()};
		//for문을 이용하여 배열의 모든 요소에 go 호출
		// 이때 Airplane인 경우 go()를 호출한 후 fly()도 호출
		
		for(int i=0;i<va.length;i++) {
			va[i].go();
			if (va[i] instanceof Airplane) {
				Airplane Air=(Airplane) va[i];
				Air.fly();
			}
		}
	}

}
