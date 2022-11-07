package exception;

public class NotPriceException extends Exception{
		//초기 입금액 0원이하
	public NotPriceException(String message) {
		super(message);
	}

	
}
