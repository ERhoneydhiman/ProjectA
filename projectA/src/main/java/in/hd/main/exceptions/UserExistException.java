package in.hd.main.exceptions;

public class UserExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserExistException() {
	}
	
	public UserExistException(String msg) {
		super(msg);
	}
}
