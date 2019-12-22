/**
 * 
 */
package com.elcom.gasscale.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * @author cuongcv
 *
 */


@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "gas_tank")
public class GasTank extends GeneralEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Column(name = "id_user", nullable = false)
	@Digits(integer = 10 , fraction = 0)
	private int idUser;
	
	@NotBlank
	@Column(name = "id_gas_tank", length = 100, nullable = false)
	private String idGasTank;
	
	@NotNull
	@Column(name = "id_type_gas_tank", nullable = false)
	@Digits(integer = 10 , fraction = 0)
	private int typeGasTank;
	
	@NotNull
	@Column(name = "residual_gas_tank",nullable = false)
	@Digits(integer = 5 , fraction = 1)
	private float residualGasTank;
	
	@NotNull
	@Column(name = "residual_battery", nullable = false)
	@Range(min = 0, max = 100, message = "{validate.message.min.max}") 
	private int residualBattery;
	
	@NotNull
	@Column(name = "replate_time", nullable = false)
	@Digits(integer = 10 , fraction = 0)
	private int replateTime;
	
}
