 package step2;

public class G01 {

	public static void main(String[] args) {
		
		
		//일반배열
		//데이터 타입이 동일한 여러개의 데이터를 저장할수 있는 공간을 만드는 것

		
		//한번 할당한 공간의 길이는 절대 불변
		int[]score=new int[5]; //배열의 갯수
		//시작점[0][1][2][3][4]
		score[0]=95;
		score[1]=70;
		score[2]=80;
		score[3]=75;
		score[4]=100;
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"th score["+i+"]"+score[i]);
		}
		
		int []month= {31,28,31,31,30,30,30,30,30,30,30,30,30};
		
		for(int i=0;i<12;i++) {
			System.out.println((i+1)+"th month["+i+"]"+month[i]);
		}
		
		
		int total=0;
		double ave = 0;
		int[]score2= {95,70,80,75,100};
		for(int i=0;i<5;i++) {
			total+=score2[i];
			ave=(double)total/5;
		}System.out.println("총점:"+total+"  총점평균:"+ave);
			
		
		
		double[]data= {9.5,7.0,13.6,7.5,10.0};
		double max,min;
		max=data[0];
		min=data[0];
		for(int i=0;i<5;i++) {
			
			if(max<data[i]) {
				
				max=data[i];
				
			}else if(min>data[i]) {
				min=data[i];
			}
			
		}System.out.println("최댓값:"+max);
		System.out.println("최소값:"+min);
	
	}
	

	
	}
