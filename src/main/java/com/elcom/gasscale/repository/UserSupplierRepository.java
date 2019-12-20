/**
 * 
 */
package com.elcom.gasscale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.elcom.gasscale.entities.UserSupplier;

/**
 * @author cuongcv
 *
 */
@Repository
public interface UserSupplierRepository extends JpaRepository<UserSupplier, Integer> {
	
//	@Query("select p from user_supplier p where p.status = :status")
//	List<UserSupplier> getAllByStatus(@Param("status") Integer status);
}
