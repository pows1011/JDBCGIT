package step5;

class Worker implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			// ���� ����ó�� Thread�� ��� ���� �ʾ����Ƿ� �ٷ� getName() ȣ�� �� �� ����.
			// currentThread() ȣ�� �� �� ����.
			// currentThread()�� �����ؼ� ������ worker run 0
			// String name=Thread.currentThread().getName();
			// static�̹Ƿ� ThreadŬ���� ������ ����
			System.out.println(Thread.currentThread().getName() + "Worker Run ..." + i);
		}

	}
}

public class TestThread5 {
	public static void main(String[] args) {
		Worker w1 = new Worker();
		Thread t1 = new Thread(w1, "������");

		// 1~ 10
		System.out.println("�켱 ����" + t1.getPriority());

		Thread t2 = new Thread(w1, "��ڻ�");
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		System.out.println("main");

	}
}
