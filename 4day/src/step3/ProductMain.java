package step3;

public class ProductMain {

	public static void main(String[] args) {
		
		
		
		Product p=new Product();// heap영역에 위치값을 p에게 넘김
		p.name="라면";
		p.Co=10101;
		p.price=1000;
		
		
		System.out.println(p.name);
		System.out.println(p.Co);
		System.out.println(p.price);
		
		

	}

}
