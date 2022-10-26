package step6;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		ScoreBoard s=new ScoreBoard();
		Scanner sc =new Scanner(System.in);
		System.out.println("°ª ÀÔ·Â");
		
		s.printScore(sc.nextInt());
		s.printScore(sc.nextInt());
		s.printScore(sc.nextInt());
		s.printScore(sc.nextInt());
		s.printScore(sc.nextInt());
		

	}

}
