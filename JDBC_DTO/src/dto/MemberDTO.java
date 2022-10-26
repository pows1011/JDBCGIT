package dto;

public class MemberDTO {
	private int num;
	private String name;
	private String addr;
	private String tel;
	public MemberDTO() {
		
	}
	
	
	public MemberDTO(String name, String addr, String tel) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}


	public MemberDTO(int num, String name, String addr, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
	
	
}
