package step8;

public class Enemy extends Thread {

	public int energy;

	public Enemy() {
		energy=10;
	}

	public synchronized void up() {
		energy += 10;
	}

	public synchronized void attack() {
		System.out.println("상대 에너지 :" + energy);
		energy -= 50;
	}

	public void run() {
		while (energy > 0 && energy < 5000) {
			up();
		
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
		
		if(energy<=0) {
			System.out.println("You Win");
		}else {
			System.out.println("I Win");
		}
	}
}
