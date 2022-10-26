package step1;

public class ParamMain {

	public static void main(String[] args) {
		Add a = new Add();

		int result_int;
		float result_float,x=3.2f,y=8.5f;
		String result_string;
		
		result_int=a.add_int(30,20);
		System.out.println(result_int);
		result_float=a.add_float(x,y);
		System.out.println(result_float);
	
		result_string=a.add_stirng("abc","def");
		System.out.println(result_string);
		
	}

}
