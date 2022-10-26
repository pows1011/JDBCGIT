package step6;



public class ZooService2 {
	
	
	
	public void pass(Animal[] a) {	//매개변수로 Animal클래스의 배열 a를받아옴
		for(int i=0;i<a.length;i++) {			
			a[i].eat();
			a[i].play();
			if (a[i] instanceof Person) {
				Person p=(Person)a[i];
				p.ticketing();
			}
			
		}
		

	}

	
}
