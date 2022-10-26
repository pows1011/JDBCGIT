package step8;

public class Peasant  extends Thread{
	
	public void run() {
		while (StarMain.e.energy > 0 && StarMain.e.energy < 5000) {
			synchronized (StarMain.s) {
				StarMain.s.add();
		}
			try {
				this.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
	
	}

