/**
 * 
 */
package com.elcom.gasscale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elcom.gasscale.entities.TypeGasTank;

/**
 * @author cuongcv
 *
 */
@Repository
public interface TypeGasTankRepository extends JpaRepository<TypeGasTank, Integer> {

}
