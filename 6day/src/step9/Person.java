package step9;

public class Person {
	//DTO 또는 VO클래스 (데이터 셋팅에 사용) 은닉성(접근자를 통해 변수에대한 접근을 막아줌)
	// 전역 변수는 접근지정자 private를 통해서 막아주고
	//public 메서드를 통해서 간접접근을 허용하는 방법
	//생성자는 1번 초기화하면 끝남. 객체가 생성되면 자동으로 생성되지만 생성자는 만들어 주는게 좋음
	//Setter은 반복적인 값 입력에 필요함
	private String name;
	private int money;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
