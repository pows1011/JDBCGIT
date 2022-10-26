package step5;
//interface는 상수와 추상 메서드만 정의 가능
public interface Flyer {
	
	public static final String pass="abc";
	
	public abstract void fly();
	
	
	
	//void test(); // 접근제어자,추상메서드 선언을 안하고 void만 입력해도 추상 메서드로 인식/
	
}
