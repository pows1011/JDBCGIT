package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Person;

public class SchoolService2 {
	private ArrayList<Person> list = new ArrayList<>();

	// �Ű������� �Ѿ�� ��ȣ�� ����Ʈ�� ���� ����� ��ȣ�� ���Ͽ� ���� ��ȣ��
	// ��Ұ� ������ -1�� ��ȯ add�� -1�̸� �߰� ���� ��ȣ�� ������ �ش� �ε����� ��ȯ
	// �ε��� ���� ã�� ���ؼ� -1(���°�)�� �ִ´�.
	private int findIndex(String tel) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTel().equals(tel)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public void addPerson(Person p) throws DuplicateTelException {
		int i = findIndex(p.getTel());
		if (i == -1) {
			list.add(p);
		} else {
			throw new DuplicateTelException("�̹� �����ϴ� ��ȣ�Դϴ� �߰� �Ұ���.");
		}

	}

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public Person findPerson(String tel) throws PersonNotFoundException {
		Person p = null;
		int i = findIndex(tel);
		if (i == -1) {
			throw new PersonNotFoundException("ã���� ���� ��ȣ�Դϴ�");
		}
		p = list.get(i);
		return p;

	}

	public void delPerson(String tel) throws PersonNotFoundException {
		int i = findIndex(tel);
		if (i == -1)
			throw new PersonNotFoundException("�����Ϸ��� ���� �����ϴ�.");
		list.remove(i);
	}

	public void editPerson(String tel, Person p) throws PersonNotFoundException {
		int i = findIndex(tel);
		if (i == -1)
			throw new PersonNotFoundException("�����Ϸ��� ���� �����ϴ�.");
		list.set(i, p);
	}

}
