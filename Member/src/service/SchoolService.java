package service;

import vo.MemberVO;

public class SchoolService {
		
		private int index;	//�迭�� ���� ī��Ʈ�� ���� ������ ���� �迭�� ���� �ϳ� �� ��� �ҋ����� 1�ǰ��� �ö󰡰Ե� (�迭�� ������ ũ�⸦ �˼�����)
		
		private MemberVO p[]=new MemberVO[10]; //10���� ���� ������ ���� �迭�� �ּҰ��� p[]��� ���� ����
		
		public void  addPerson(MemberVO p) { // �Ű������� MemberVO�� �ִ� ������������ ���� �޾ƿ� (name,tel,add,id)
			this.p[index]=p;				// ���ο� �迭�� ������ ���ο��� �޾ƿ� p�� ������ ���� �����ְ� index++�� ���� ī��Ʈ ����
			index++;
		}
		
		//toString() p�迭�� ��� ��θ� ��� index�� �̿��� �迭 ��ΰ� �ƴ϶�
		// �߰� �� ��� ������ ���
		public void printAll() {
			for(int i=0;i<index;i++) {
				System.out.println(p[i]);
				
			}
		}
		
		public MemberVO findPerson(String tel) {	 // ���ο��� �˻��� ���� tel���� �޾ƿ�
			MemberVO per=null;							// ���� ���µ� ���Ͻ����ٶ� �̿��� ������ �ڷ��� �������ƴ� Ÿ���� ���� MemberVO�� ����
			
			for(int i=0;i<index;i++) {				// �迭�� ����� ������ŭ �ݺ�����
				if(p[i].getTel().equals(tel)) {		// MemberVO�� �迭�� Tel���� �����ͼ� �޾ƿ� Tel���� ��ġ�ϴ� �� Ȯ��
					per=p[i];						// tel�� ���� ��ġ�Ѵٸ� per���� �ȿ� ã�ƿ� �迭�� ���� �־���
				}else {
					System.out.println("�̻��� ��");
					return per;
				}
					
			}return per;
			
			
		}
		
		
}
