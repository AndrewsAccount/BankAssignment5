package Exceptions;

public class ExceedsFraudSuspicionLimitException extends Exception {
	
	ExceedsFraudSuspicionLimitException(String errorMessage){
		super(errorMessage);
	}

}
