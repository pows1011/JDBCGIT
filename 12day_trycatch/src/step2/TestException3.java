package step2;

public class TestException3 {
	
	public static void main(String[] args) {
		
		
		String names[]= {"ũ����Ż","������","Ȳ����",};
		
		try {
			
			System.out.println(names[1]);
			System.out.println(names[2]);
			
			String s=null;
			System.out.println(s.length());
			
			
		}catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println("�ε��� ���� �ʰ�");
			
		}catch (Exception e) {
			e.printStackTrace(); // Exception �޼����� �߻���� ���
		}
		System.out.println("���� ����");
		
		
		
		
		
		
		
	}
}
