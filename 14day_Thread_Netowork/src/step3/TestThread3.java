package step3;

class Worker extends Thread{
	
	Worker(String name){
		super(name);
	}
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println(getName()+" Work Run ..." +i);
		}
	}
}


public class TestThread3 {
	
	public static void main(String[] args) {
		
		Worker w=new Worker("KIM");
		w.start();
		
		Worker w2=new Worker("Park");
		w2.start();
		
		System.out.println("메인 종료");
	}
}
