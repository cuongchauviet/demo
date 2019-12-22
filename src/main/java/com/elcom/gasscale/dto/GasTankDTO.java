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
	@Size(min = 0, max = 100, message = "{validate.message.min.max}")
	private String idGasTank;
	
	@NotNull
	@Digits(integer = 10, message = "{validate.message.length}" + "10", fraction = 0)
	private int typeGasTank;
	
	@NotNull
	@Digits(integer = 5, message = "{validate.message.length}" + "5", fraction = 1)
	private float residualGasTank;
	
	@NotNull
	@Range(min = 0, max = 100, message = "{validate.message.min.max}")
	private int residualBattery;
	
	@NotNull
	@Digits(integer = 10, message = "{validate.message.length}" + "10", fraction = 0)
	private int replateTime;
	
	@NotNull
	@Digits(integer = 10, message = "{validate.message.length}" + "10", fraction = 0)
	private int createTime;
	
	@NotNull
	@Digits(integer = 10, message = "{validate.message.length}" + "10", fraction = 0)
	private int updateTime;
}
