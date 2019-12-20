/**
 * 
 */
package com.elcom.gasscale.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * @author cuongcv
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User extends GeneralEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	@Column(name="phone", length = 32, nullable = false, unique = true)
	private String phone;
	
	@NotBlank
	@Column(name = "full_name", length = 100, nullable = false)
	private String fullName;
	
	@NotBlank
	@Column(name = "pwd", length = 100, nullable = false)
	private String pwd;
	
//	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@ManyToMany
	@JoinTable(name = "user_role",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles;
}
