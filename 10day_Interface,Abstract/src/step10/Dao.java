package step10;

public interface Dao {
	
	
	void connect();
	void addPerson(MemberVO p);
	void printAll();
	MemberVO findPerson(String name);
	
	
}
