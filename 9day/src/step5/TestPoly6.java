package step5;

class Vehicle{
	
	public void go() {
		System.out.println("����");
	}
}
class Car extends Vehicle{
	public void go() {
		System.out.println("�ڵ����� ����");
	}
}

class Airplane extends Vehicle{
	public void go() {
		System.out.println("����Ⱑ ����");
	}
	
	public void fly() {
		System.out.println("����Ⱑ ���ư���");
	}
}



public class TestPoly6 {

	public static void main(String[] args) {
		
		//�������� ����ǹǷ�  Vehicle �θ�Ÿ���� �迭�� �ڽ� ��ü ��Ҹ� �߰� ����
		Vehicle va[]= {new Vehicle(),new Car(),new Airplane()};
		//for���� �̿��Ͽ� �迭�� ��� ��ҿ� go ȣ��
		// �̶� Airplane�� ��� go()�� ȣ���� �� fly()�� ȣ��
		
		for(int i=0;i<va.length;i++) {
			va[i].go();
			if (va[i] instanceof Airplane) {
				Airplane Air=(Airplane) va[i];
				Air.fly();
			}
		}
	}

}
