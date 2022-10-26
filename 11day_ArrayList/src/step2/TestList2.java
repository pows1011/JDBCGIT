package step2;

import java.util.ArrayList;

public class TestList2 {
	public static void main(String[] args) {
		
		ArrayList list =new ArrayList();
		
		list.add(new FriendVO("윤아",22));
		list.add(new FriendVO("태연",23));
		list.add(new FriendVO("제시카",24));
		list.add(new FriendVO("유리",26));
		list.add(new FriendVO("서현",20));
		list.add(new FriendVO("써니",22));
		list.add(new FriendVO("수영",25));
		list.add(new FriendVO("효연",24));
		list.add(new FriendVO("티파니",22));
		System.out.println(list.size());
		//list의 toString()은 오버라이딩 되어 있지만
		//FriendVO의 실제 내용값을 보기 위해서는
		//FriendVO의 toString()또한 오버라이딩 되어야 한다.
		System.out.println(list);
		//FriendVO의 toString()또한 오버라이딩 해 준다.
		//0번 인덱스의 이름만 출력
		//list.get()은 Object형으로 반환하므로
		//FriendVO의 getName()을 호출하기 위해서는 
		//Object casting 이 필요하다.
		FriendVO vo1=(FriendVO)list.get(0);
		System.out.println(vo1.getName());
		
		//인덱스 8의 나이를 출력
		//list.get(8)
		FriendVO vo2=(FriendVO)list.get(8);
		System.out.println(vo2.getAge());
		
		System.out.println("***  list안의 요소의 이름  ***");
		for(int i=0;i<list.size();i++) {
			FriendVO vo3=(FriendVO)list.get(i);
			System.out.println(vo3.getName());
		}
		
		System.out.println("***  list안의 요소의 요소중 25세 이상인 이름만 출력***");
		for(int i=0;i<list.size();i++) {
			FriendVO vo3=(FriendVO)list.get(i);
			if(vo3.getAge()>=25) {
				System.out.println(vo3.getName());	
			}
			
		}
	}
}

