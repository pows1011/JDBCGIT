package service;

import vo.AccountVO;

public class ServiceImpl implements Service{

    private Dao dao; 	
	
	public ServiceImpl() {
		dao = new AccountDao();
	}

	@Override
	public void insertAccount(AccountVO vo) {
		dao.insertAccount(vo);
		
	}

	@Override
	public AccountVO findAccount(String accNum) {
		// TODO Auto-generated method stub
		return dao.findAccount(accNum);
	}

	@Override
	public int depositMoney(String accNum, int money) {
		// TODO Auto-generated method stub
		return dao.depositMoney(accNum, money);
	}

	@Override
	public int withDrawMoney(String accNum, int money) {
		// TODO Auto-generated method stub
		return dao.withDrawMoney(accNum, money);
	}

	@Override
	public int sumAccount(String name) {
		// TODO Auto-generated method stub
		return dao.sumAccount(name);
	}

	@Override
	public int avgAccount(String name) {
		// TODO Auto-generated method stub
		return dao.avgAccount(name);
	}

	@Override
	public int createTransfer(String sendAccount, String receiveAccount, int money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean findNameExist(String accountName) {
		
		
		return dao.findNameExist(accountName);
	}

	@Override
	public boolean findAccountExist(String accountNumber) {
		
		return dao.findAccountExist(accountNumber);
	}

	
	
	
}
