package in.hd.main.dto;

import in.hd.main.entities.UserEntity;
import lombok.Data;

@Data
public class CourseReqDTO {
	private String name;
	private Long price;
	 
	private UserEntity userEntity;
}
