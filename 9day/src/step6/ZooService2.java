package step6;



public class ZooService2 {
	
	
	
	public void pass(Animal[] a) {	//�Ű������� AnimalŬ������ �迭 a���޾ƿ�
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
