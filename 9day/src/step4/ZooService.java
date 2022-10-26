package step4;

public class ZooService {
	/*
	 * 다양한 동물객체를 처리하기 위해 부모타입인 Animal 타입을 매개변수를 선언한다. 매개변수에 넘어온 인자값(객체)은 enter()내부에서
	 * 먹다와 각자 오버라이딩된 play()를 호출하다. 단,Person 객체일 경우 반드시 먼저 티켓을 구매하고 먹고 놀아야 한다.
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
