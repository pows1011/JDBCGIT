package step3;

import java.util.Scanner;

public class Product {
	
	String name;
	int Co;
	int price;
	
	void input(Scanner sc) { // �Է±��
		System.out.println();
		name=sc.nextLine();
		System.out.println();
		Co=sc.nextInt();
		System.out.println();
		price=sc.nextInt();
	}
	
	void print() {	// ��±��
		System.out.println(name);
		System.out.println(Co);
		System.out.println(price);
	}
	
}
