package second;

public class IfElse {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		boolean flag=false;
		
		if(a>10) {
			System.out.println("a는 10보다 크다");
		}else {
			System.out.println("a는 10보다 크지 않다");
		}
		
		if(a==10 && b>=20) {
			System.out.println("조건을 만족함");
		}else {
			System.out.println("조건을 만족하지않음");
		}
		
		if(flag) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
	}
}
