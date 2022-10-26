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
		System.out.println(name + " ������ ���� ó�� ���� ...");

		if (seat == false) {
			System.out.println(name + " ������ ���� ���� ...");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			seat = true;
		} else {
			System.out.println(name + " ������ ���� ����...");
		}

	}
}

public class TestSynchronized {
	public static void main(String[] args) {

		Therater th = new Therater();
		Thread t1 = new Thread(th, "������");
		Thread t2 = new Thread(th, "��ڻ�");

		t1.start();
		t2.start();

	}

}
