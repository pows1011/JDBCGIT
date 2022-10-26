package step6;

class ReadWorker implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�������� ������ �д� ������.. " + i);
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
			System.out.println("������ ���� ������.. " + i);
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
			t1.join();//t1������ ���� �Ϸ�ñ��� �ٸ� �������� 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		System.out.println("��������");

	}
}
