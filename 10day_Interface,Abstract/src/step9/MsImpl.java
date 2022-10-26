package step9;

public class MsImpl implements DbInterFace {
	@Override
	public void connect() {
		System.out.println("MS-SQL 연결");

	}

	@Override
	public void delete() {
		System.out.println("MS-SQL 삭제");

	}

	@Override
	public void insert() {
		System.out.println("MS-SQL 추가");

	}

	@Override
	public void select() {
		System.out.println("MS-SQL 검색");

	}

	@Override
	public void update() {
		System.out.println("MS-SQL 수정");

	}
}
