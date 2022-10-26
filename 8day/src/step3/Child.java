package step3;

public class Child extends Parent{
	private String hobby;

	public Child() {
		System.out.println("child»ý¼ºÀÚ");
	}
	
	public void printParentInfo() {
		System.out.println("name"+name);
		System.out.println("age"+age);
		//System.out.println("money"+money);
		System.out.println("hobby"+hobby);
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
