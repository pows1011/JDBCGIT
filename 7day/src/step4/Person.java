package step4;

public class Person {
	private String name;
	private Car car;	//car라는 변수앞에 Car 라는 클래스명
	//Car객체의 주소값을 담기 위해 car 선언하고
	//참조형 데이터 타입은 클래스 명이 된다.
	//객체를 생성할때 car의 주소값을 person에게 던져준다.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;//객체의 주소값 들어감
	}
	
	
	
}
