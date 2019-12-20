/**
 * 
 */
package com.elcom.gasscale.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class GasTankDTO {
	
	@NotNull
	@Digits(integer = 10 , fraction = 0)
	private int idUser;
	
	@NotBlank
	@Size(min = 0, max = 100, message = "The gas tank name must be between {min} and {max} characters.")
	private String idGasTank;
	
	@NotNull
	@Digits(integer = 10, message = "Must be length <= 10", fraction = 0)
	private int typeGasTank;
	
	@NotNull
	@Digits(integer = 5, message = "Must be length <= 5", fraction = 1)
	private float residualGasTank;
	
	@NotNull
	@Range(min = 0, max = 100, message = "The Percent must be between {min} and {max} characters.")
	private int residualBattery;
	
	@NotNull
	@Digits(integer = 10, message = "Must be length <= 10", fraction = 0)
	private int replateTime;
	
	@NotNull
	@Digits(integer = 10, message = "Must be length <= 10", fraction = 0)
	private int createTime;
	
	@NotNull
	@Digits(integer = 10, message = "Must be length <= 10", fraction = 0)
	private int updateTime;
}
