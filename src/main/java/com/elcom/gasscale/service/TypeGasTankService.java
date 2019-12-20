/**
 * 
 */
package com.elcom.gasscale.service;

import com.elcom.gasscale.entities.TypeGasTank;

/**
 * @author cuongcv
 *
 */
public interface TypeGasTankService {
	public TypeGasTank getTopById() throws Exception;
	
	public boolean insertTypeGasTank(TypeGasTank typeGasTank) throws Exception;
}
