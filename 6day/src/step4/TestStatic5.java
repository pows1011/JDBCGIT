package step4;

class Car{
	static int scount;
	int count;
	//��ü ������ �ڽ��� �ν��Ͻ� ������ ��� �ʱ�ȭ
	//static������ Ŭ���� ������ �� �� �ʱ�ȭ
	
	Car(){ //������ ( ���� ���� �ʾƵ� �ڵ� ���� �Ǿ� ������ ���� ����� �ִ°� ��Ģ )
			//�޸� �ʱ�ȭ�� �������� �ַ� ��� ( �� ���� )

		System.out.println("car����");
		count++;
		scount++;
	}
}


public class TestStatic5 {

	public static void main(String[] args) {
		Car c=new Car();
		
		System.out.println(c.count);

		Car c2=new Car();
		System.out.println(c2.count);
		
		Car c3=new Car();
		System.out.println(c3.count);
		
		
		System.out.println(Car.scount++);

	}

}
