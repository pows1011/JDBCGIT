package step2;

class Worker extends Thread {
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Work Run ... " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class TestThread2 {

	public static void main(String[] args) {
		
		Worker w=new Worker();
		w.run();
		System.out.println("메인 종료");
	}
}
