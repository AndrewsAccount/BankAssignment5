package Exceptions;

public class ExceedsCombinedBalanceLimitException extends Exception{
	
	ExceedsCombinedBalanceLimitException(String errorMessage){
		super(errorMessage);
	}

}
