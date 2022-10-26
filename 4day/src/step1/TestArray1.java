package step1;

public class TestArray1 {

	public static void main(String[] args) {
		
		//배열선언
		int[] ages;			 // new가 나오면 객체와 관련이 있음.
		ages=new int[3];	 // 객체와 주소값
		 					 // 배열(객체)에 ages 라는 주소값을 준것 (new int[3]이 위치할 주소값)		 
		
		System.out.println(ages);
		System.out.println(ages[0]); // 배열의 시작점 [0], ages[0]안에있는 값을 불러오는것
		System.out.println(ages.length); //배열의 길이에 대한 출력
		
		//할당 : 인덱스 0부터 시작 할당
		ages[0]=12;
		ages[1]=22;
		ages[2]=32;
		
		
		System.out.println(ages[2]);

		System.out.println("for문으로 출력");
		for(int i=0; i<ages.length;i++) {
			System.out.println(ages[i]);
		}
		
		
		System.out.println("ages배열에서 20이상만 출력");
		for(int i=0; i<ages.length;i++) {
			if(ages[i]>=20) {
				System.out.println(ages[i]);
			}
			
		}

	}

}
