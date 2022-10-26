package step7;

public class HrService{
	
	private Employee[] group;
	
	//toString()을 오버라이딩 했으므로 객체의 내용 출력
	public void printAll(Employee[] group) {
		for(int i=0;i<group.length;i++) {
			System.out.println(group[i].toString()); // 배열에 들어 있는 내용을 문자열로 출력 한다.
		}
	}
	
	
	public void printByAddress(String address,Employee[] group) {
		
		for(int i=0;i<group.length;i++) {
			if(group[i].getAddress().equals(address)) {
				System.out.println(group[i]);
			}
		}
		
		
	}
	// 자식 객체를 부모 타입이 참조 가능 (다형성)
	// 모두 Employess의 자식이다. 그러므로 Employee로 받는다.
	public void printAnnualSalary(Employee e) {
		
		System.out.println(e+" 연봉:"+e.getSalary()*12);
			
		
		
	}
	
	public void printTotalCost(Employee[] group) {
		int sum=0;
		for(int i=0;i<group.length;i++) {
			sum+=group[i].getSalary()+12;
			if(group[i] instanceof Engineer) {
				Engineer en=(Engineer)group[i];
				sum+=en.getBonus()*12;
			}
		}
		System.out.println(sum);
	}
		
	
}
