package in.hd.main.exceptions;

import lombok.Data;

@Data
public class ErrorResponce {
	private Integer errorCode;
	private String errorMsg;
	
	public ErrorResponce(Integer errorCode, String message) {
		this.errorCode = errorCode;
		this.errorMsg = message;
		
	}
	
	

}
