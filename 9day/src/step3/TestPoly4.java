package step3;

class Animal{}
class Person extends Animal{}
class Dog extends Animal{}


public class TestPoly4 {

	public static void main(String[] args) {
		
		Animal a= new Person();
		/*
		 * instanceof ������ 
		 * ��ü�� Ÿ���� ���Ͽ� ture or false�� ��ȯ
		 * �� is a ����� (��Ӱ���:ex)����� �����̴�.)����
		 * true�� ��ȯ�ϹǷ� �׻� �ڽĺ��� �θ������ ���ؾ� �Ѵ�.
		 * 
		 * */
		
		if(a instanceof Person)
			System.out.println("���� ����̴�.");
		if(a instanceof Dog)
			System.out.println("���� ����.");
		if(a instanceof Animal)
			System.out.println("���� �����̴�.");
		
		
		
	}

}
