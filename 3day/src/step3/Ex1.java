package step3;

public class Ex1 {

	public static void main(String[] args) {
		
		// 위 for 문이 1번 돌동안 밑에 for문은 3번의 반복을 하게됨
		for(int a=1;a<=2; a++) {
			for(int b=1;b<=3;b++) {
				System.out.print("a="+a+" b="+b+",\t");
			}
			System.out.println();
		}
		
		
		//
		for(int a=2;a<=9; a++) {
			for(int b=1;b<=9;b++) {
				System.out.print(a+"*"+b+"="+a*b+"\t");
				
			}System.out.println("");
			
		}
		
		
		
		
		
		int i,j;
		for(i=0;i<10;i++) {
			for(j=2;j<10;j++) {
				if(i==0) {
					System.out.print(j+"단\t");
				}else {
					System.out.print(j+"*"+i+"="+(j*i+"\t"));
				}
			}System.out.println();
		}
		
		
		for(int a=1;a<=3; a++) {
			for(int b=1;b<=5;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int a=0;a<=3; a++) {
			for(int b=0;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
