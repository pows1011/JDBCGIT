package step6;

public class Member2 {
	
	String name;
	String tel;
	String address;
	
						//같은 이름의 생성자가 2개지만 에러가 안나옴 ( 생성자 오버로딩 )
	public Member2() {	//초기화만 하는 생성자
		name="no name";
		tel="no tel";
		address="no address";
		
	}

	public Member2(String name) {
		super();
		this.name = name;
		tel="no tel";
		address="no address";
	}
	
	//생성자 오버로딩 ( 일반 메서드에서도 적용이 됨 )
	// 회원가입 페이지에서 주로 사용 필수사항 , 선택사항 적용시 3개중 해당하는 초기화값에 작동
	public Member2(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	void print() {
		System.out.println("name:"+name);		
		System.out.println("tel:"+tel);
		System.out.println("address:"+address);
		System.out.println();
	}

	
	
}
