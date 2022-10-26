package step3;

public class Car {
	private String model;
	private String color="white";
	
	
	public Car() {
		super();
	}


	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}


	public void printinfo() {
		System.out.println(model+" "+color);
	}
	
	
	
	
}
