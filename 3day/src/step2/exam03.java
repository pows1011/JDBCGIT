package step2;



public class exam03 {

	public static void main(String[] args) {
		int sum = 0;
		
		/*
	 for(int i=1; i<=100;i++) {
		 if(i%2==0) {
			 sum++;
			 System.out.println("¦��:"+i);
			
		 }
		 
	 }System.out.println("¦���� ����:"+sum);
		
*/	
		for(int i=1; i<=100;i++) {
			 if(i%2==0) {
				 sum+=i;
				 System.out.println("¦��:"+i);
				
			 }
			 
		 }System.out.println("¦���� ��:"+sum);
	}

}
