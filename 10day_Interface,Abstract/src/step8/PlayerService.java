package step8;

public class PlayerService {
	
	public void simpleplay(Player p) {
		p.play();
	}
	public void allplay(Player[] pa) {
		for(int i=0;i<pa.length;i++) {
			if(pa[i] instanceof CdPlayer) {
				Player p=(Player)pa[i];
				//((CdPlayer)p).insertCd();
				((CdPlayer)pa[i]).insertCd();
			}
			pa[i].play();
			
		}
		
	}
}
