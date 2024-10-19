package in.hd.main.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class CoursesEntity {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cid;
	private String name;
	private Long price;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	@JsonBackReference  
	private UserEntity userEntity;
 
}
