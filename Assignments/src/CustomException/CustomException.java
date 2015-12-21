package CustomException;

/**
 * @author Anjita
 * CustomException class handling system exception
 */
public class CustomException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor with argument message
	 * @param message
	 */
	public CustomException(String message){
		super(message);
	}
	
	/**
	 * Constructor with argument message and cause
	 * @param message
	 * @param cause
	 */
	public CustomException(String message, Throwable cause){
		super(message,cause);
	}

}
