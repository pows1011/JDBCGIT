package exception;

public class InsufficientMoneyException extends Exception{
		//초기 입금액 0원이하
	public InsufficientMoneyException(String message) {
		super(message);
	}

	
}
