package com.elcom.gasscale.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	@NotBlank
    @Size(min = 10, max = 10, message = "The phone number must be between {min} and {max} characters.")
	@Pattern(regexp="(^$|[0-9]{10})",message = "The phone must be number")
    private String phone;
	
	@NotBlank
    @Size(min = 0, max = 100, message = "The full name must be between {min} and {max} characters.")
	private String fullName;
	
	@NotBlank
    @Size(min = 0, max = 50, message = "The password must be between {min} and {max} characters.")
	private String pwd;
	
	@Digits(integer = 10, message = "Must be length <= 10", fraction = 0)
	private long createTime;
    
//	@Range(min = 0, max = 10, message = "The update time must be between {min} and {max} characters.") 
	@Digits(integer = 10, message = "Must be length <= 10", fraction = 0)
	private long updateTime;
	
	@NotBlank
    @Size(min = 0, max = 100, message = "The role must be between {min} and {max} characters.")
	private String role;
}
