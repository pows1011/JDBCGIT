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
		return "������ ���� [������ �ڵ�=" + AdminCode + ", ID=" + getId() + ", �̸�=" + getName() + ", ��ȭ��ȣ="
				+ getTel() + ", �ּ�=" + getAdd() + "]";
	}
	
	
	
}
