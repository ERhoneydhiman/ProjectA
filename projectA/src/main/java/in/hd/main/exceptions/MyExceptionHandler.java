package in.hd.main.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler(value = UserExistException.class)
	@ResponseStatus
	
	public @ResponseBody ErrorResponce handleException(Exception e) {
		return new ErrorResponce(HttpStatus.CONFLICT.value(), e.getMessage());
		
	}
}
