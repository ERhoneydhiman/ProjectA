package in.hd.main.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.hd.main.dto.UserReqDTO;
import in.hd.main.dto.UserResDTO;
import in.hd.main.entities.UserEntity;
import in.hd.main.repository.UserRepository;
import in.hd.main.translater.UserTranslater;

@Repository
public class UserDao {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserTranslater userTranslater;
	
	public UserResDTO saveUser(UserReqDTO userReqDTO) {
		UserEntity userEntity= userTranslater.userDtoToEntity(userReqDTO);
		
		
		 // Set the user reference in each course
	    if (userEntity.getCourses() != null) {
	        userEntity.getCourses().forEach(course -> course.setUserEntity(userEntity)); 
	    }
	    
	    
		UserEntity savedUserEntity = userRepository.save(userEntity);
		UserResDTO userResDTO = userTranslater.userEntityToDto(savedUserEntity);
		
		return userResDTO;
	}
	
	public List<UserResDTO> getAllUsers() {
		List<UserEntity> userEntityList = userRepository.findAll();
		List<UserResDTO> userResponseDTOList = new ArrayList<>();
		  
		 for (UserEntity user : userEntityList) {
	            UserResDTO userResDTO = new UserResDTO();
	            userResDTO.setName(user.getName());
	            userResDTO.setEmail(user.getEmail());
	            userResDTO.setAddress(user.getAddress()); 
	            userResDTO.setCourses(user.getCourses()); 

	            userResponseDTOList.add(userResDTO);
	        }
		return userResponseDTOList;
	
	}
	
	
	
}
