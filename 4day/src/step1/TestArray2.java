package step1;

public class TestArray2 {

	public static void main(String[] args) {
		
		int salary[]=new int[3];
		salary[0]=100;
		salary[1]=200;
		salary[2]=300;
		
		
		System.out.println("salary�迭�� ����");
		int sum=0; // ���ο� ������ ������ ����������. (���������� �� �ʱ�ȭ�� ����� �ϴ� ����)
		for(int i=0;i<salary.length;i++) {		
			sum+=salary[i];
			
		}System.out.println("����:"+sum);
		
		int price[]= {100,200,500,300,600};
		System.out.println("price�� ���");
		int sum2=0;
		double avg=0;
		for(int i=0;i<price.length;i++) {
			sum2+=price[i];
		}
		
		avg=sum2/price.length;
		System.out.println("��հ�:"+avg);
		
		System.out.println("�ٸ���� : "+sum2/price.length);
	}

}
