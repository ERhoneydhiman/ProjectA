package in.hd.main.translater;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.hd.main.dto.UserReqDTO;
import in.hd.main.dto.UserResDTO;
import in.hd.main.entities.UserEntity;

@Component
public class UserTranslater {
	@Autowired
	private ModelMapper modelMapper;
	
	public UserEntity userDtoToEntity(UserReqDTO userReqDTO) {
		return modelMapper.map(userReqDTO, UserEntity.class);
	}
	
	public UserResDTO userEntityToDto(UserEntity userEntity) {
		return modelMapper.map(userEntity, UserResDTO.class);
	}

}
