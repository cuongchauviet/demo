/**
 * 
 */
package com.elcom.gasscale.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
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
public class UserSupplierDTO {
	
	@NotBlank
    @Size(min = 10, max = 10, message = "The phone number must be between {min} and {max} characters.")
	@Pattern(regexp="(^$|[0-9]{10})",message = "The phone must be number and length is 10 characters.")
    private String phone;
	
	@NotBlank
    @Size(min = 0, max = 100, message = "The full name must be between {min} and {max} characters.")
	private String fullName;
	
    @Size(min = 0, max = 255, message = "The address name must be between {min} and {max} characters.")
	private String address;
	
    @Size(min = 0, max = 1000, message = "The note must be between {min} and {max} characters.")
	private String note;
}
