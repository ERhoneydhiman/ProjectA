package in.hd.main.dto;

import java.util.List;

import in.hd.main.entities.AddressEntity;
import in.hd.main.entities.CoursesEntity;
import lombok.Data;

@Data
public class UserReqDTO {
	
	private String name;
	private String email;
	private String password;

	private AddressEntity address;
	private List<CoursesEntity> courses;

}
