package test;

import service.Service;
import service.ServiceImpl;
import vo.AccountVO;

public class TestAccountDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Service service = new ServiceImpl(); 
   
    service.insertAccount(new AccountVO("111","백박사",10000));	
    service.insertAccount(new AccountVO("222","백선생",1000));
    service.insertAccount(new AccountVO("333","백석사",10500));
    service.insertAccount(new AccountVO("444","백왕자",10500));
    service.insertAccount(new AccountVO("555","백백사",12000));
   
    AccountVO vo=service.findAccount("111");
    System.out.println(vo);
    int money=service.depositMoney("444",10000);
    System.out.println(money+" 가 입금 되었습니다.");
	int money2=service.withDrawMoney("111",100);
	System.out.println(money+"가 출금되었습니다.");
	int sum=service.sumAccount("백박사");
	System.out.println(sum);
	int avg=service.avgAccount("백박사");
	System.out.println(avg);

		
		
		
		
		
	
	}
	

}
