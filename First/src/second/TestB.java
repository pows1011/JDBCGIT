package second;

import java.util.Scanner;

public class TestB {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("aÀÇ °ªÀ» ÀÔ·Â");
		a=sc.nextInt();
		
		if (a%2==0 && a>0) {
			System.out.println("a´Â Â¦¼ö");
		} else if (a==0){
			System.out.println("a´Â 0");
		}else {
			System.out.println("a´Â È¦¼ö");
		}
		
		if(a%2==0) {
			System.out.println("a´Â Â¦¼ö");
		}else {
			System.out.println("a´Â È¦¼ö");
		}

	}

}
