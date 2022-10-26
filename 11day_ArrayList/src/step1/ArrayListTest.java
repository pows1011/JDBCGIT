package step1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("aaa");
		a1.add("bbb");
		a1.add(1,"ccc");
		a1.set(2,"fff");
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(i+"번째 요소 :"+a1.get(i));
		}
		
		
		System.out.println("검색할 값을 입력하세요");
		String srh=sc.next();
		int idx=0;
		if(a1.contains(srh)) { // ArrayList안에 값이 포함되어 있는지 확인
			idx=a1.indexOf(srh);  //리스트에 저장된 위치를 반환 
		}else {
			System.out.println("값이 존재하지 않습니다");
		}
		

		
		
		
		System.out.println("삭제할 값을 입력하세요");
		srh=sc.next();
		idx=0;
		if(a1.contains(srh)) {
			idx=a1.indexOf(srh);
			a1.remove(idx);//삭제
		}else {
			System.out.println("값이 존재하지 않습니다.");
		}
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(i+"번째 요소 :"+a1.get(i));
		}
		
		
		
		System.out.println("전체 삭제");
		a1.removeAll(a1);
		if(a1.isEmpty()) { //
			System.out.println("리스트가 비어 있다.");
		}else {
			for(int i=0;i<a1.size();i++)
			{
				System.out.println(i+"번째 요소 :"+a1.get(i));
			}
		}
		
			
		
		
		
	}
}
