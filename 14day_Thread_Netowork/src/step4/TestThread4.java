package step4;

class ServerWorker extends Thread{
	private int time;
	
	ServerWorker(String name,int time){
		
		super(name);
		this.time=time;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
		try {
			Thread.sleep(time);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	
			System.out.println(getName()+" Work Run ..." +i);
		}
	}
}


public class TestThread4 {
		public static void main(String[] args) {
			ServerWorker w1=new ServerWorker("Kim",1000);
			w1.start();
			
			ServerWorker w2=new ServerWorker("Lee",3000);
			w2.start();
			
			System.out.println("메인 종료");
		}

	
}
