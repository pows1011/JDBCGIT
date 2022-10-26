package step7;

import step5.Bird;
import step5.Flyer;
import step5.SuperMan;

public class TestInterFace2 {
	public static void main(String[] args) {
		FlyerService f=new FlyerService();
		f.enter(new Airplane());
		f.enter(new Bird());
		f.enter(new SuperMan());
		
		Flyer f1[]= {new Airplane(),new Bird(), new SuperMan()};
		
		f.enter(f1);
		
		//곰플레이어 동영상 재생
		//MP3 플레이어 MP3 재생
		//CD를 삽입하다.
		//CDplayer CD 재생
	}
}
