/**
 * 
 */
package com.elcom.gasscale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elcom.gasscale.entities.GasTank;

/**
 * @author cuongcv
 *
 */
@Repository
public interface GasTankRepository extends JpaRepository<GasTank, Integer> {

}
