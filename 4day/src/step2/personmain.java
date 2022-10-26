package step2;

public class personmain {

	public static void main(String[] args) {
		
		person p =new person(); //heap 객체이름이 생성 p=객체의 주소값을 가지고있음
		
		
		p.a=1; // person에 있던 int=a 에 1이라는 값을 대입해준것
		p.b=2;
		System.out.println(p.a);
		
	}

}
