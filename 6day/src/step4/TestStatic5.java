package step4;

class Car{
	static int scount;
	int count;
	//객체 생성시 자신의 인스턴스 변수는 계속 초기화
	//static변수는 클래스 생성시 한 번 초기화
	
	Car(){ //생성자 ( 생성 하지 않아도 자동 생성 되어 있으나 직접 만들어 주는게 원칙 )
			//메모리 초기화의 목적으로 주로 사용 ( 값 셋팅 )

		System.out.println("car생성");
		count++;
		scount++;
	}
}


public class TestStatic5 {

	public static void main(String[] args) {
		Car c=new Car();
		
		System.out.println(c.count);

		Car c2=new Car();
		System.out.println(c2.count);
		
		Car c3=new Car();
		System.out.println(c3.count);
		
		
		System.out.println(Car.scount++);

	}

}
