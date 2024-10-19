package in.hd.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import in.hd.main.dto.UserReqDTO;
import in.hd.main.dto.UserResDTO;
import in.hd.main.exceptions.ErrorResponce;
import in.hd.main.exceptions.UserExistException;
import in.hd.main.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
//	@ExceptionHandler(value = UserExistException.class)
//	@ResponseStatus
//	public ErrorResponce handleException(Exception e) {
//		return new ErrorResponce(HttpStatus.CONFLICT.value(), e.getMessage());
//		
//	}
	
	@GetMapping("/check")
	public void showData() throws Exception {
		try {
			userService.checkFun();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@PostMapping("/save")
	public ResponseEntity<UserResDTO> saveData( @RequestBody UserReqDTO userReqDTO) {
		UserResDTO data = null;
//		try {
			data = userService.saveUserData(userReqDTO);
//		} catch(Exception e) {
//			
//			e.printStackTrace();
//		}
		return new ResponseEntity<UserResDTO>(data, HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<UserResDTO>> getData() {
	    List<UserResDTO> userList = userService.getAllUserData(); 
	    return  new ResponseEntity<List<UserResDTO>>(userList, HttpStatus.OK);  
	}
}
