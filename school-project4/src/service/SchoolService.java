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
				throw new DuplicateTelException("�Ȱ��� ��ȣ�� �ִ�. �߰� �Ұ���");
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
			throw new PersonNotFoundException("ã������ ����� �������� �ʽ��ϴ�");
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
			throw new PersonNotFoundException("�����Ϸ��� ���� �������� �ʽ��ϴ�");
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
			throw new PersonNotFoundException("���� �Ϸ��� ���� �������� �ʽ��ϴ�");
		}
		
		
	
		
	}
}
