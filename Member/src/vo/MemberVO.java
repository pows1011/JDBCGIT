package vo;

public class MemberVO {	//vo는 데이터를 저장하고 받아오는 역할만을 실행
	private String id;
	private String name;
	private String tel;
	private String add;
	
	
	public MemberVO(String id, String name, String tel, String add) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.add = add;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {	// MemberVO가 출력문에 의해 실행될때 toString에 설정된 문자를 포함하여 출력
		return "MemberVO [id=" + id + ", name=" + name + ", tel=" + tel + ", add=" + add + "]";
	}
	
	
	
	
}
