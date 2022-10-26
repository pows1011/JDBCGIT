package step9;

public class Process {

	private DbInterFace db;

	public Process(DbInterFace db) {
		this.db = db;
	}

	void connect() {
		db.connect();
	}

	void select() {
		db.select();
	}

	void insert() {
		db.insert();
	}

	void delete() {
		db.delete();
	}

	void update() {
		db.update();
	}
}
