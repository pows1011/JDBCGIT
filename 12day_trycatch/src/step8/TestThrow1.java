package step8;

class MyException extends Exception {
	
	 MyException(String message) {
		super(message);
	}
	 
}

class Service{
	//Exception �߻��Ǹ� ȣ���� ������ ������ : throws
	public void test(int age)throws MyException {
		if(age <=0) {
			throw new MyException("���̴� 1�� �̻��̾�� �մϴ�");
		}
		System.out.println(age+"��");
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
