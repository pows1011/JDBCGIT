package step5;

class Worker implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			// 이전 예제처럼 Thread를 상속 받지 않았으므로 바로 getName() 호출 할 수 없다.
			// currentThread() 호출 할 수 없다.
			// currentThread()를 응용해서 소지섭 worker run 0
			// String name=Thread.currentThread().getName();
			// static이므로 Thread클래스 명으로 접근
			System.out.println(Thread.currentThread().getName() + "Worker Run ..." + i);
		}

	}
}

public class TestThread5 {
	public static void main(String[] args) {
		Worker w1 = new Worker();
		Thread t1 = new Thread(w1, "소지섭");

		// 1~ 10
		System.out.println("우선 순위" + t1.getPriority());

		Thread t2 = new Thread(w1, "백박사");
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		System.out.println("main");

	}
}
