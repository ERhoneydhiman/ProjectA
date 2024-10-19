package in.hd.main.translater;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.hd.main.dto.CourseReqDTO;
import in.hd.main.entities.CoursesEntity;

@Component
public class CourseTranslater {
	@Autowired
	private ModelMapper modelMapper;
	
	public CoursesEntity addressDtoToEntity(CourseReqDTO courseReqDTO) {
		return modelMapper.map(courseReqDTO, CoursesEntity.class);
	}
	
	public CourseReqDTO addressEntityToDto(CoursesEntity addressEntity) {
		return modelMapper.map(addressEntity, CourseReqDTO.class);
	}
}
