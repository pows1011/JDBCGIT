package service;

import java.util.ArrayList;
import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import vo.Person;

public class SchoolService {

	private ArrayList<Person> list = new ArrayList<>();

	public void addPerson(Person p) throws DuplicateTelException {

		for (int i = 0; i < list.size(); i++) {
			if (p.getTel().equals(list.get(i).getTel())) {
				throw new DuplicateTelException("똑같은 번호가 있다. 추가 불가능");
			}
		}
		list.add(p);
	}

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public Person findPerson(String tel) throws PersonNotFoundException {
		Person find = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTel().equals(tel)) {
				find = list.get(i);
			}
		}
		if (find == null) {
			throw new PersonNotFoundException("찾으려는 사람이 존재하지 않습니다");
		} else {
			return find;
		}

	}

	public void delPerson(String tel) throws PersonNotFoundException {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTel().equals(tel)) {
				list.remove(i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			throw new PersonNotFoundException("삭제하려는 값이 존재하지 않습니다");
		}

	}
	
	public void editPerson(String tel,Person p)throws PersonNotFoundException{
		boolean flag=false;
		for(int i=0;i<list.size();i++) {
			if (list.get(i).getTel().equals(tel)) {
				list.set(i, p);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			throw new PersonNotFoundException("수정 하려는 값이 존재하지 않습니다");
		}
		
		
	
		
	}
}
