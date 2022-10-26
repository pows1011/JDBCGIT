package step3;

public class TestCar {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.printinfo();
		Car car2=new Car("K5","RED");
		car2.printinfo();
		car1.printinfo();
		
		System.out.println(car1);
		System.out.println(car2);
	
		car1=car2;
		car1.printinfo();
		//가비지 컬렉터에 의해 null,white 제거 되면 재사용시 다시 할당
		
		System.out.println(car1);
		System.out.println(car2);
	}

}
