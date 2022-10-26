package step1;

public class TestArray {

	public static void main(String[] args) {
		
		int rain[][]=new int[2][3];
		
		System.out.println(rain.length);
		System.out.println(rain[0].length);
		rain[0][0]=10;
		rain[0][1]=20;
		rain[1][0]=30;
		System.out.println(rain[0][1]);
		
		
		int [][] arr= {{1,2,3},{4,5,6}};
		
		int i,j;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
