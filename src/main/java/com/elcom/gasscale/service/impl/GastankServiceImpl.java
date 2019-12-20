/**
 * 
 */
package com.elcom.gasscale.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elcom.gasscale.dto.GasTankDTO;
import com.elcom.gasscale.entities.GasTank;
import com.elcom.gasscale.exception.ResourceNotFoundException;
import com.elcom.gasscale.repository.GasTankRepository;
import com.elcom.gasscale.service.GastankService;

/**
 * @author cuongcv
 *
 */
@Service
public class GastankServiceImpl implements GastankService {
	
	private final GasTankRepository gasTankRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	public GastankServiceImpl(GasTankRepository gasTankRepository) {
		this.gasTankRepository = gasTankRepository;
	}
	
	
	@Override
	public List<GasTank> getAllGastank() throws Exception {
		return gasTankRepository.findAll();
	}


	@Override
	public GasTank getGastankById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(GasTankDTO gasTankDTO) throws Exception {
		if(gasTankDTO == null) {
			throw new ResourceNotFoundException("gas tank is null");
		}
		GasTank gasTank = modelMapper.map(gasTankDTO, GasTank.class);
		GasTank gasTankResual = gasTankRepository.save(gasTank);
		return gasTankResual != null ? true : false;
	}
}
