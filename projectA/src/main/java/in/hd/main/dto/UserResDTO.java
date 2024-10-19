package in.hd.main.dto;

import java.util.List;

import in.hd.main.entities.AddressEntity;
import in.hd.main.entities.CoursesEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResDTO {
	
	private String name;
	private String email;

	private AddressEntity address;
	private List<CoursesEntity> courses;
}
