/**
 * 
 */
package com.elcom.gasscale.service;

import java.util.List;

import com.elcom.gasscale.dto.GasTankDTO;
import com.elcom.gasscale.entities.GasTank;


/**
 * @author cuongcv
 *
 */
public interface GastankService {
	
	public List<GasTank> getAllGastank() throws Exception;
	
	public GasTank getGastankById(int id) throws Exception;
	
	public boolean insert(GasTankDTO gasTankDTO) throws Exception;
}
