package step5;

public class TestInterFace1 {
	public static void main(String[] args) {
		
		//인터페이스 -> 계층구조형성 -> 다형성 적용가능 -> 표준화
		//상위 인터페이스 타입 변수로 하위 객체 잠조 가능
		
		Flyer f1=new Bird();
		Flyer f2=new SuperMan();
		//Flyer 인터페이스 타입의 배열에 하위객체들 추가 가능
		Flyer fa[] = {f1,f2};
		for(int i=0;i<fa.length;i++) {
			fa[i].fly();
			System.out.println(f1 instanceof Flyer);
			
		}
	}
}
