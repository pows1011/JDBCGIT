package step9;

public class OracleImpl implements DbInterFace {

	@Override
	public void connect() {
		System.out.println("Oracle ����");

	}

	@Override
	public void delete() {
		System.out.println("Oracle ����");

	}

	@Override
	public void insert() {
		System.out.println("Oracle �߰�");

	}

	@Override
	public void select() {
		System.out.println("Oracle �˻�");

	}

	@Override
	public void update() {
		System.out.println("Oracle ���� ");

	}
}
