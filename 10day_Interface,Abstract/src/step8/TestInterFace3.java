package step8;

public class TestInterFace3 {
	public static void main(String[] args) {
		PlayerService pl=new PlayerService();
//		pl.simpleplay(new CdPlayer());
//		pl.simpleplay(new GomPlayer());
//		pl.simpleplay(new Mp3Player());
		Player p1=new GomPlayer();
		Player p2=new Mp3Player();
		Player p3=new CdPlayer();
		pl.simpleplay(p1);
		pl.simpleplay(p2);
		pl.simpleplay(p3);
		
		
		//Player pa[]= {new CdPlayer(),new GomPlayer(),new Mp3Player()};
		Player pa[]= {p1,p2,p3};
		pl.allplay(pa);
		
	}
}
