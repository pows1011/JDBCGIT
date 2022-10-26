package vo;

public class Admin extends MemberVO{
	private String AdminCode;

	public Admin(String id, String name, String tel, String add, String adminCode) {
		super(id, name, tel, add);
		AdminCode = adminCode;
	}

	public String getAdminCode() {
		return AdminCode;
	}

	public void setAdminCode(String adminCode) {
		AdminCode = adminCode;
	}

	@Override
	public String toString() {
		return "관리자 계정 [관리자 코드=" + AdminCode + ", ID=" + getId() + ", 이름=" + getName() + ", 전화번호="
				+ getTel() + ", 주소=" + getAdd() + "]";
	}
	
	
	
}
