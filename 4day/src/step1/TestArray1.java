package step1;

public class TestArray1 {

	public static void main(String[] args) {
		
		//�迭����
		int[] ages;			 // new�� ������ ��ü�� ������ ����.
		ages=new int[3];	 // ��ü�� �ּҰ�
		 					 // �迭(��ü)�� ages ��� �ּҰ��� �ذ� (new int[3]�� ��ġ�� �ּҰ�)		 
		
		System.out.println(ages);
		System.out.println(ages[0]); // �迭�� ������ [0], ages[0]�ȿ��ִ� ���� �ҷ����°�
		System.out.println(ages.length); //�迭�� ���̿� ���� ���
		
		//�Ҵ� : �ε��� 0���� ���� �Ҵ�
		ages[0]=12;
		ages[1]=22;
		ages[2]=32;
		
		
		System.out.println(ages[2]);

		System.out.println("for������ ���");
		for(int i=0; i<ages.length;i++) {
			System.out.println(ages[i]);
		}
		
		
		System.out.println("ages�迭���� 20�̻� ���");
		for(int i=0; i<ages.length;i++) {
			if(ages[i]>=20) {
				System.out.println(ages[i]);
			}
			
		}

	}

}
