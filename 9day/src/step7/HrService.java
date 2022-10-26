package step7;

public class HrService{
	
	private Employee[] group;
	
	//toString()�� �������̵� �����Ƿ� ��ü�� ���� ���
	public void printAll(Employee[] group) {
		for(int i=0;i<group.length;i++) {
			System.out.println(group[i].toString()); // �迭�� ��� �ִ� ������ ���ڿ��� ��� �Ѵ�.
		}
	}
	
	
	public void printByAddress(String address,Employee[] group) {
		
		for(int i=0;i<group.length;i++) {
			if(group[i].getAddress().equals(address)) {
				System.out.println(group[i]);
			}
		}
		
		
	}
	// �ڽ� ��ü�� �θ� Ÿ���� ���� ���� (������)
	// ��� Employess�� �ڽ��̴�. �׷��Ƿ� Employee�� �޴´�.
	public void printAnnualSalary(Employee e) {
		
		System.out.println(e+" ����:"+e.getSalary()*12);
			
		
		
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
