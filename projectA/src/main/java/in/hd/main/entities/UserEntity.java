package in.hd.main.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
@Entity
public class UserEntity {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String password;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="aid")
	private AddressEntity address;
	
	@OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<CoursesEntity> courses;
}
