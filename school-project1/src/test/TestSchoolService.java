package test;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {

	public static void main(String[] args) {
				 
			SchoolService service=new SchoolService();	// SchoolService�� �޼ҵ带 ����ϱ����� serivce��ü�� �����Ѵ�.
			//Student s=new Student("011","ũ����Ż","�Ǳ�","12");
			//service.addPErson(s);
			
			service.addPerson(new Employee("012","��","��⵵","������")); //addPerson�� �Ű������� Person P �������� Person�� �ٸ� Ŭ������ ��ӵǾ��ְ�
			service.addPerson(new Student("011","��","��õ","1212"));		//�� ��ӵǾ� �ִ� Ŭ�����鿡�� super�� �����صξ� �� �������� ���� �θ�ü�� ����
			service.addPerson(new Teacher("010","��","����", "����"));		// ���ǰ��ֱ� ������ ���� ������ ������ Ŭ���� ���� �־��شٸ� �� Ŭ�������� ������ ���� �־��ټ� ����.
			service.printAll();
			Person p=service.findPerson("010");					//010�̶�� Tel�� ���� serviceŬ������ �˻��޼ҵ忡 �Ű������� �Է½����ְ� �ִٸ� �� �ּҰ��� ������ ��ȯ.

			
			
			if(p !=null)								//���� �˻����� ���ٸ� null�� ��ȯ�ϰ� �ɰ��̰� �׷��ٸ� ã���� ���� ���� ���. 
				System.out.println(p);					// �װ� �ƴ϶�� �� �ּҰ��� ������ ������ Person p������ ���� ���
			else 
				System.out.println("ã���� ���� ��");
				
			
			

	}

}
