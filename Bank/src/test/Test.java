package test;

import java.util.Scanner;

import exception.DuplicateAccountException;
import exception.InsufficientMoneyException;
import exception.InvalidBalanceException;
import exception.NotFoundAccountException;
import exception.NotFoundNameException;
import service.Service;
import service.ServiceImpl;
import vo.AccountVO;

public class Test {

	public static void main(String[] args) throws InsufficientMoneyException, DuplicateAccountException,InvalidBalanceException,NotFoundAccountException,NotFoundNameException {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    String accountNumber=null;
	String accountName=null;
	int balance=0;
	AccountVO vo=null;
	
	boolean flag=true; 
	int i=0; 
	Service service = new ServiceImpl(); 
	while(flag){
		System.out.println("1.�ű԰���");
		System.out.println("2.���°˻�");
		System.out.println("3.�Ա�");
		System.out.println("4.���");
		System.out.println("5.�� �ܾ�");
		System.out.println("6.����ܾ�");
		System.out.println("7.����");
		i=sc.nextInt();
		switch(i){ 
		case 1: 
			
			System.out.println("���� ��ȣ �Է�");
			accountNumber=sc.next();
			System.out.println("�����ָ� �Է�");
			accountName=sc.next();			
			System.out.println("�ʱ��Ա� �׼� �Է�");
			balance=sc.nextInt();
			service.insertAccount(new AccountVO(accountNumber, accountName, balance));
			
			
		break; 
		
		case 2: 
			System.out.println("ã���� ���� ��ȣ �Է�");
			accountNumber=sc.next();
			vo=service.findAccount(accountNumber);
			if(vo!=null) {
				System.out.println(vo);	
			}
			
		   break; 
		
		case 3: 
				System.out.println("�Ա��Ͻ� ���¹�ȣ �Է�");
				accountNumber=sc.next();
				System.out.println("�Ա��Ͻ� �׼� �Է�");
				int j=sc.nextInt();
				int a=service.depositMoney(accountNumber, j);
				if(service.findAccountExist(accountNumber)) {
					System.out.println(a+"���� �Ա� �Ǿ����ϴ�");	
				}
				
	 break; 
		
		case 4: 	
			System.out.println("����Ͻ� ���¹�ȣ �Է�");
			accountNumber=sc.next();
			System.out.println("����Ͻ� �׼� �Է�");
			j=sc.nextInt();
			a=service.withDrawMoney(accountNumber, j);
			if(service.findAccountExist(accountNumber)) {
				System.out.println(a+"���� ��� �Ǿ����ϴ�");	
			}

		
			break;
			
		case 5:	
			System.out.println("�� �ܾ� Ȯ���Ͻ� �����ָ� �Է�");
			accountName=sc.next();
			a=service.sumAccount(accountName);
			System.out.println(a+"���� �ܾ��� ���� �մϴ�");
			break;
		
		case 6: 
			System.out.println("��� �ܾ� Ȯ���Ͻ� �����ָ� �Է�");
			accountName=sc.next();
			a=service.avgAccount(accountName);
			System.out.println("����ܾ� :"+a+"��");
			break;
		
		case 7:
			flag=false; 
			default:
				break;
		
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	}

}
