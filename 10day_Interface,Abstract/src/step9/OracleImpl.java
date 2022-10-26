package step9;

public class OracleImpl implements DbInterFace {

	@Override
	public void connect() {
		System.out.println("Oracle 연결");

	}

	@Override
	public void delete() {
		System.out.println("Oracle 삭제");

	}

	@Override
	public void insert() {
		System.out.println("Oracle 추가");

	}

	@Override
	public void select() {
		System.out.println("Oracle 검색");

	}

	@Override
	public void update() {
		System.out.println("Oracle 수정 ");

	}
}
