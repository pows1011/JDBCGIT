package step7;

class Therater implements Runnable {
	private boolean seat = false;

	@Override
	public void run() {
		reserve();
	}

	// Rock
	public synchronized void reserve() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " 스레드 예매 처리 시작 ...");

		if (seat == false) {
			System.out.println(name + " 스레드 예매 성공 ...");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			seat = true;
		} else {
			System.out.println(name + " 스레드 예매 실패...");
		}

	}
}

public class TestSynchronized {
	public static void main(String[] args) {

		Therater th = new Therater();
		Thread t1 = new Thread(th, "소지섭");
		Thread t2 = new Thread(th, "백박사");

		t1.start();
		t2.start();

	}

}
