package in.hd.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hd.main.dao.UserDao;
import in.hd.main.dto.UserReqDTO;
import in.hd.main.dto.UserResDTO;


@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void checkFun() throws Exception {
		System.out.println("data showed by service...");
		throw new Exception("Hello! Exceptionnnnnn");
	}
	
	
	public UserResDTO saveUserData(UserReqDTO userReqDTO) {
		UserResDTO savedData = userDao.saveUser(userReqDTO);
		return savedData;
	}


	public List<UserResDTO> getAllUserData() {
		return userDao.getAllUsers();
	}

}
