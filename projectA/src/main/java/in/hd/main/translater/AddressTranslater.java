package in.hd.main.translater;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.hd.main.dto.AddressReqDTO;
import in.hd.main.entities.AddressEntity;

@Component
public class AddressTranslater {
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressEntity addressDtoToEntity(AddressReqDTO userReqDTO) {
		return modelMapper.map(userReqDTO, AddressEntity.class);
	}
	
	public AddressReqDTO addressEntityToDto(AddressEntity addressEntity) {
		return modelMapper.map(addressEntity, AddressReqDTO.class);
	}
}
