package test;

import service.Service;
import service.ServiceImpl;
import vo.AccountVO;

public class TestAccountDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Service service = new ServiceImpl(); 
   
    service.insertAccount(new AccountVO("111","��ڻ�",10000));	
    service.insertAccount(new AccountVO("222","�鼱��",1000));
    service.insertAccount(new AccountVO("333","�鼮��",10500));
    service.insertAccount(new AccountVO("444","�����",10500));
    service.insertAccount(new AccountVO("555","����",12000));
   
    AccountVO vo=service.findAccount("111");
    System.out.println(vo);
    int money=service.depositMoney("444",10000);
    System.out.println(money+" �� �Ա� �Ǿ����ϴ�.");
	int money2=service.withDrawMoney("111",100);
	System.out.println(money+"�� ��ݵǾ����ϴ�.");
	int sum=service.sumAccount("��ڻ�");
	System.out.println(sum);
	int avg=service.avgAccount("��ڻ�");
	System.out.println(avg);

		
		
		
		
		
	
	}
	

}
