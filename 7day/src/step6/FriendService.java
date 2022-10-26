package step6;

public class FriendService {
	//Service 입력,출력등의 기능을 담담하는 클래스
	
	public void changeRef(Friend f) {
		f=new Friend("보아",25);
	}
	public void changeValue(Friend f) {
		f.setName("유이");// 참조 변수 f(주소값)
	}
}
