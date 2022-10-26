package service;

import vo.MemberVO;

public class SchoolService {
		
		private int index;	//배열의 값의 카운트를 위해 생성된 변수 배열에 값을 하나 씩 등록 할떄마다 1의값이 올라가게됨 (배열의 공간의 크기를 알수있음)
		
		private MemberVO p[]=new MemberVO[10]; //10개의 저장 공간을 가진 배열의 주소값을 p[]라는 곳에 대입
		
		public void  addPerson(MemberVO p) { // 매개변수로 MemberVO에 있는 전역변수들의 값을 받아옴 (name,tel,add,id)
			this.p[index]=p;				// 새로운 배열의 공간에 메인에서 받아온 p의 값들을 저장 시켜주고 index++을 통해 카운트 증가
			index++;
		}
		
		//toString() p배열의 요소 모두를 출력 index를 이용해 배열 모두가 아니라
		// 추가 된 요소 까지만 출력
		public void printAll() {
			for(int i=0;i<index;i++) {
				System.out.println(p[i]);
				
			}
		}
		
		public MemberVO findPerson(String tel) {	 // 메인에서 검색에 사용될 tel값을 받아옴
			MemberVO per=null;							// 값을 얻어온뒤 리턴시켜줄때 이용할 변수로 자료형 변수가아닌 타입형 변수 MemberVO로 선언
			
			for(int i=0;i<index;i++) {				// 배열의 저장된 공간만큼 반복진행
				if(p[i].getTel().equals(tel)) {		// MemberVO의 배열의 Tel값을 가져와서 받아온 Tel값과 일치하는 지 확인
					per=p[i];						// tel의 값이 일치한다면 per변수 안에 찾아온 배열의 값을 넣어줌
				}else {
					System.out.println("이상한 값");
					return per;
				}
					
			}return per;
			
			
		}
		
		
}
