package in.hd.main.dto;

import lombok.Data;

@Data
public class AddressReqDTO {
	private String city;
	private String state;
	private Long pin;

}
