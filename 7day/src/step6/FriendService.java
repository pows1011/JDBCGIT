package step6;

public class FriendService {
	//Service �Է�,��µ��� ����� ����ϴ� Ŭ����
	
	public void changeRef(Friend f) {
		f=new Friend("����",25);
	}
	public void changeValue(Friend f) {
		f.setName("����");// ���� ���� f(�ּҰ�)
	}
}
