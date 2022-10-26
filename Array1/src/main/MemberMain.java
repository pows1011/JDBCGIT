package main;

import java.util.ArrayList;

import service.MemberService;
import vo.MemberVO;

public class MemberMain {
	public static void main(String[] args) {
		
		ArrayList<MemberVO> list=new ArrayList<>();
		MemberService service=new MemberService();
		service.menu(list);
		
	}
}
