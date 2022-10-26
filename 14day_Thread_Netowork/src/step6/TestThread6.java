package step6;

class ReadWorker implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("서버에서 데이터 읽는 스레드.. " + i);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class WriterWorker implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("데이터 쓰는 스레드.. " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class TestThread6 {

	public static void main(String[] args) {

		ReadWorker w1 = new ReadWorker();
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(new WriterWorker());
		
		t1.start();
		
		try {
			t1.join();//t1스레드 수행 완료시까지 다른 스레드대기 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		System.out.println("메인종료");

	}
}
