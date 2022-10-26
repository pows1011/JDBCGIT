package step11;

public class TestConstructor {

	public static void main(String[] args) {
		Person p=new Person("아이유");
		System.out.println(p.getName());
		p.setName("보아");
		System.out.println(p.getName());
		//생성자를 통한 할당과 set메소드를 통한 할당은 결과적으로 동일
		//용도에 있어서는 차이는 ?
		//생성자에서 명시한 인자값을 입력하지 않으면 컴파일 에러 즉 객체 생성의
		// 조건을 인자값 있는 생성자에서 요구한다.
		//생성자는 필수적
		//set메소드는 선택적 또는 정보 수정을 위함.
		//생성자를 통한 할당 -객체 생성에 필수적인 요소
		//set 메소드를 통한 할당 - 선택적인 요소
	}

}
