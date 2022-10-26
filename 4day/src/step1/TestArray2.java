package step1;

public class TestArray2 {

	public static void main(String[] args) {
		
		int salary[]=new int[3];
		salary[0]=100;
		salary[1]=200;
		salary[2]=300;
		
		
		System.out.println("salary배열의 총합");
		int sum=0; // 메인에 선언한 변수는 지역변수다. (지역변수는 꼭 초기화를 해줘야 하는 변수)
		for(int i=0;i<salary.length;i++) {		
			sum+=salary[i];
			
		}System.out.println("총합:"+sum);
		
		int price[]= {100,200,500,300,600};
		System.out.println("price의 평균");
		int sum2=0;
		double avg=0;
		for(int i=0;i<price.length;i++) {
			sum2+=price[i];
		}
		
		avg=sum2/price.length;
		System.out.println("평균값:"+avg);
		
		System.out.println("다른방법 : "+sum2/price.length);
	}

}
