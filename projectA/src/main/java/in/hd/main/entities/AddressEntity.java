package in.hd.main.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class AddressEntity {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long aid;
	private String city;
	private String state;
	private Long pin;

}
