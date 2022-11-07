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
		System.out.println("1.신규계좌");
		System.out.println("2.계좌검색");
		System.out.println("3.입금");
		System.out.println("4.출금");
		System.out.println("5.총 잔액");
		System.out.println("6.평균잔액");
		System.out.println("7.종료");
		i=sc.nextInt();
		switch(i){ 
		case 1: 
			
			System.out.println("계좌 번호 입력");
			accountNumber=sc.next();
			System.out.println("계좌주명 입력");
			accountName=sc.next();			
			System.out.println("초기입금 액수 입력");
			balance=sc.nextInt();
			service.insertAccount(new AccountVO(accountNumber, accountName, balance));
			
			
		break; 
		
		case 2: 
			System.out.println("찾으실 계좌 번호 입력");
			accountNumber=sc.next();
			vo=service.findAccount(accountNumber);
			if(vo!=null) {
				System.out.println(vo);	
			}
			
		   break; 
		
		case 3: 
				System.out.println("입금하실 계좌번호 입력");
				accountNumber=sc.next();
				System.out.println("입금하실 액수 입력");
				int j=sc.nextInt();
				int a=service.depositMoney(accountNumber, j);
				if(service.findAccountExist(accountNumber)) {
					System.out.println(a+"원이 입금 되었습니다");	
				}
				
	 break; 
		
		case 4: 	
			System.out.println("출금하실 계좌번호 입력");
			accountNumber=sc.next();
			System.out.println("출금하실 액수 입력");
			j=sc.nextInt();
			a=service.withDrawMoney(accountNumber, j);
			if(service.findAccountExist(accountNumber)) {
				System.out.println(a+"원이 출금 되었습니다");	
			}

		
			break;
			
		case 5:	
			System.out.println("총 잔액 확인하실 계좌주명 입력");
			accountName=sc.next();
			a=service.sumAccount(accountName);
			System.out.println(a+"원의 잔액이 존재 합니다");
			break;
		
		case 6: 
			System.out.println("평균 잔액 확인하실 계좌주명 입력");
			accountName=sc.next();
			a=service.avgAccount(accountName);
			System.out.println("평균잔액 :"+a+"원");
			break;
		
		case 7:
			flag=false; 
			default:
				break;
		
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	}

}
