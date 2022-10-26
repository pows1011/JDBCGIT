package serivce;

import java.util.ArrayList;

import vo.Person;

public class SchoolService {

	private ArrayList<Person> list = new ArrayList<>();

	public void addPerson(Person p) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {

			if (p.getTel().equals(list.get(i).getTel())) {
				flag = true;
			}
		}

		if (flag == false) {
			list.add(p);
		} else {
			System.out.println("동일한 번호가 존재");
		}
	}

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("=================");
		}
	}

	public Person findPerson(String tel) {
		Person find = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTel().startsWith(tel)) {
				find = list.get(i);
				break;
			}
		}
		return find;
	}

	public void delPerson(String tel) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTel().startsWith(tel)) {
				list.remove(i);
				break;
			}
		}

	}

	public void updatePerson(String tel, Person p) {
		for (int i = 0; i < list.size(); i++) {
			if (tel.startsWith(tel)) {
				list.set(i, p);
				break;
			}
		}

		
	}

}
