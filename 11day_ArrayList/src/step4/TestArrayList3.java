package step4;

import java.util.ArrayList;

public class TestArrayList3 {
	public static void main(String[] args) {

		ArrayList<ProductVO> list = new ArrayList<ProductVO>();

		list.add(new ProductVO("아이폰", "애플", 200));
		list.add(new ProductVO("갤럭시", "삼성", 300));
		list.add(new ProductVO("넥서스", "삼성", 400));

		System.out.println("*** 리스트에서 삼성에서 생산한 제품명 출력 ***");

		for (int i = 0; i < list.size(); i++) {
			ProductVO pro = list.get(i);

			if (pro.getMaker().equals("삼성")) {
				System.out.println(pro.getName());
			}
		}

		System.out.println("*** 리스트에서 전체 상품의 평균 가격 ***");
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			ProductVO vo = list.get(i);
			sum += vo.getPrice();

		}
		System.out.println(sum / list.size());

		
		System.out.println("*** 지정한 인덱스에 새로운 객체 재할당 ***");
		list.set(0,new ProductVO("베가", "SKY", 500));
		System.out.println(list);
		
		System.out.println("*** 리스트의 상품명 중 갤로 시작하는 상풍 정보 ***");
		
		for (int i = 0; i < list.size(); i++) {
			ProductVO vo = list.get(i);
			if(vo.getName().startsWith("갤")) {
				System.out.println(vo);
			}

		}
	}
	
}
