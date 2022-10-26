package step1;

public class While1 {

	public static void main(String[] args) {
		

		int i=1;
		int sum=0;
		while(i<=10) {
			System.out.println((i++)+"\t");
			
		}
		
		while(i<=100) {
			sum+=i;
			i+=2;
			System.out.println("sum="+sum);
			
		}
	}

}
