package step6;

public class ScoreBoard {
									
	void printScore(int i) {			//princScore �޼ҵ弱�� �Ű�����(�Է¹޴� �� )������ int Ÿ������ �޾ƿ�	
		String str = null;				//main���� �޾ƿ� i�� ���ǹ��� Ÿ���� ���� �ԷµǸ� �װ��� �´� ���
										//�޼ҵ� �ȿ� ������ �����ϸ� �� �޼ҵ� �ȿ����� ����Ǵ� ���������� ����

		if (i >= 90 && i <= 100) {
			str = "A";
		} else if (i >= 80 && i <= 89) {
			str = "B";
		}	else if (i >= 70 && i <= 79) {
			str = "C";
		}else if (i >= 60 && i <= 69) {
			str = "D";
		}else if(i>=0&&i<=59){
			str="F";
		}else {
			str="�߸��� ������";
		}System.out.println(str);
	}
}
