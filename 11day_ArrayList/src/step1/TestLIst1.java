package step1;

import java.util.ArrayList;

public class TestLIst1 {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add("아이유"); //데이터 추가
		list.add("보아");
		list.add("아이유");
		
		
		System.out.println(list.size());//데이터의 갯수. 
		System.out.println(list);       //length(방의 길이)  
		System.out.println(list.get(0));
		
		list.add(1); // 1.5 버전 이상부터 자동으로 변환
		list.add(new Integer(1));// wrapper class
		System.out.println(list);
		
		list.remove(4);// 데이터 삭제
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	
}
