/**
 * 
 */
package com.elcom.gasscale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elcom.gasscale.entities.UserCustomer;

/**
 * @author cuongcv
 *
 */
@Repository
public interface UserCustomerRepository extends JpaRepository<UserCustomer, Integer> {
	public UserCustomer findByPhone(String phone);
}
