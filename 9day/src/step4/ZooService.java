package step4;

public class ZooService {
	/*
	 * �پ��� ������ü�� ó���ϱ� ���� �θ�Ÿ���� Animal Ÿ���� �Ű������� �����Ѵ�. �Ű������� �Ѿ�� ���ڰ�(��ü)�� enter()���ο���
	 * �Դٿ� ���� �������̵��� play()�� ȣ���ϴ�. ��,Person ��ü�� ��� �ݵ�� ���� Ƽ���� �����ϰ� �԰� ��ƾ� �Ѵ�.
	 */

	public void enter(Animal a) {
		if (a instanceof Person) {
			Person p=(Person)a;
			p.ticketing();
			((Person)a).ticketing();
		}
		a.eat();
		a.play();

	}

}
