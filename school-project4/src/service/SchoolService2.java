package service;

import java.util.ArrayList;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Person;

public class SchoolService2 {
	private ArrayList<Person> list = new ArrayList<>();

	// 매개변수로 넘어온 번호와 리스트의 내부 요소의 번호를 비교하여 같은 번호의
	// 요소가 없으면 -1이 반환 add는 -1이면 추가 같은 번호가 있으면 해당 인덱스를 반환
	// 인덱스 값을 찾기 위해서 -1(없는값)를 넣는다.
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
			throw new DuplicateTelException("이미 존재하는 번호입니다 추가 불가능.");
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
			throw new PersonNotFoundException("찾을수 없는 번호입니다");
		}
		p = list.get(i);
		return p;

	}

	public void delPerson(String tel) throws PersonNotFoundException {
		int i = findIndex(tel);
		if (i == -1)
			throw new PersonNotFoundException("삭제하려는 값이 없습니다.");
		list.remove(i);
	}

	public void editPerson(String tel, Person p) throws PersonNotFoundException {
		int i = findIndex(tel);
		if (i == -1)
			throw new PersonNotFoundException("삭제하려는 값이 없습니다.");
		list.set(i, p);
	}

}
