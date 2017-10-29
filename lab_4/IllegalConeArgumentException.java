package lab_4;

public class IllegalConeArgumentException extends Exception{
	/* Custom exception; used in Cone class */
	public final static String EXCEPTION_NEGATIVE_VALUE = "Unexpected negative value;" ;	
	
	public IllegalConeArgumentException() {
	}
	
	public IllegalConeArgumentException(String errorMessage) {
		super(errorMessage);
	}
}
