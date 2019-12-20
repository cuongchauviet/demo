/**
 * 
 */
package com.elcom.gasscale.dto;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

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
public class ConfigDeviceDTO {
	
	@NotNull
//    @Size(min = 0, max = 3, message = "Percent gas warning must be between {min} and {max} characters.")
//	@Min(value = 0, message = "Percent gas warning should not be less than 0")
//	@Max(value = 100, message = "Percent gas warning should not be greater than 100")
	@Range(min = 0, max = 100, message = "The Percent gas warning must be between {min} and {max} characters.") 
    private short warningPercentGas;
	
	@NotNull
//    @Size(min = 0, max = 3, message = "Percent battery warning must be between {min} and {max} characters.")
//	@Min(value = 0, message = "Percent battery warning should not be less than 0")
//	@Max(value = 100, message = "Percent battery warning should not be greater than 100")
	@Range(min = 0, max = 100, message = "The Percent battery warning must be between {min} and {max} characters.") 
    private short warningPercentBattery;
	
	@NotNull
	@Digits(integer = 10, message = "Must be length <= 10", fraction = 0)
	@Min(value = 1, message = "Percent gas warning should not be less than 0")
    private long idTypeGasTank;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Digits(integer = 10, message = "Must be length <= 10", fraction = 0)
	private long updateTime;
}
