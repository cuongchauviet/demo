/**
 * 
 */
package com.elcom.gasscale.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cuongcv
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTO {
	
	@NotBlank
	@Size(min = 0, max = 32, message = "The phone number must be between {min} and {max} characters.")
	private String phone;
	
	@NotBlank
	@Size(min = 3, max = 50, message = "{passwrod.leng}")
	private String pwd;
}
