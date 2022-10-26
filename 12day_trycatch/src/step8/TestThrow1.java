package step8;

class MyException extends Exception {
	
	 MyException(String message) {
		super(message);
	}
	 
}

class Service{
	//Exception 발생되면 호출한 곳으로 던진다 : throws
	public void test(int age)throws MyException {
		if(age <=0) {
			throw new MyException("나이는 1세 이상이어야 합니다");
		}
		System.out.println(age+"세");
	}
}


public class TestThrow1 {
	public static void main(String[] args) {
		
		Service ser=new Service();
		try {
//			ser.test(0);
			ser.test(13);
		}catch(MyException e){
			System.out.println(e.getMessage());
		}
		
		
	}
}
