/**
 * 
 */
package com.elcom.gasscale.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elcom.gasscale.entities.TypeGasTank;
import com.elcom.gasscale.repository.TypeGasTankRepository;
import com.elcom.gasscale.service.TypeGasTankService;

/**
 * @author cuongcv
 *
 */
@Service
public class TypeGasTankServiceImpl implements TypeGasTankService {
	
	@Autowired
	private TypeGasTankRepository typeGasTankRepository;
	
	
	@Override
	public TypeGasTank getTopById() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertTypeGasTank(TypeGasTank typeGasTank) throws Exception {
		// TODO Auto-generated method stub
		if(typeGasTank != null) {
			typeGasTankRepository.save(typeGasTank);
			return true;
		}
		return false;
	}

}
