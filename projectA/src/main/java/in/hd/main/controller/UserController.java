package in.hd.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.hd.main.dto.UserReqDTO;
import in.hd.main.dto.UserResDTO;
import in.hd.main.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/check")
	public void showData() throws Exception {
		try {
			userService.checkFun();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@PostMapping("/save")
	public ResponseEntity<UserResDTO> saveData( @RequestBody UserReqDTO userReqDTO){
		UserResDTO data = userService.saveUserData(userReqDTO);
		return new ResponseEntity<UserResDTO>(data, HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<UserResDTO>> getData() {
	    List<UserResDTO> userList = userService.getAllUserData(); 
	    return  new ResponseEntity<List<UserResDTO>>(userList, HttpStatus.OK);  
	}

}
