package step1;

public class TestException2 {
	public static void main(String[] args) {
		String s=null;
		
		try {//Exception�� �߻��� ������ ����Ǵ� �ڵ� ��
			
			System.out.println(s.length());
			//�� �ڵ���ο��� Exception�� �߻��Ǹ� �ٷ� Catch�� 
			//Exception �߻� �ȵǸ� �Ʒ� �ڵ������ ����ȴ�.
			
			System.out.println("���� ���� Ȯ��");
			//JVM�� ���� Exception�� �޾Ƽ� ������ ������� ó��
			//Exception �� ó��
			
		}catch (NullPointerException ne) {
			System.out.println("null�̹Ƿ� ���̸� ���� �� �����ϴ�");
		}
		
		
	}
}
