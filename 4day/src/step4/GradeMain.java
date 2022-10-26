package step4;

public class GradeMain {

	public static void main(String[] args) {
		Grade g=new Grade();// 按眉狼 林家 g
		float tot;
		g.name="全辨悼";
		g.kor=100;
		g.eng=90;
		g.math=80;
		tot=g.total=100+90+80;
		g.avg=tot/3;
		
		
		System.out.println(g.name);
		System.out.println(g.kor);
		System.out.println(g.eng);
		System.out.println(g.math);
		System.out.println(g.total);
		System.out.println(g.avg);
		
	}

}
