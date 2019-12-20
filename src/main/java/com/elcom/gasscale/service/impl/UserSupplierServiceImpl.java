/**
 * 
 */
package com.elcom.gasscale.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elcom.gasscale.dto.UserSupplierDTO;
import com.elcom.gasscale.entities.UserSupplier;
import com.elcom.gasscale.exception.ResourceNotFoundException;
import com.elcom.gasscale.repository.UserSupplierRepository;
import com.elcom.gasscale.service.UserSupplierService;

/**
 * @author cuongcv
 *
 */
@Service
public class UserSupplierServiceImpl implements UserSupplierService {
	
	private final UserSupplierRepository userSupplierRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	public UserSupplierServiceImpl(UserSupplierRepository userSupplierRepository) {
		this.userSupplierRepository = userSupplierRepository;
	}

	@Override
	public List<UserSupplier> getAllUserSupplier() throws Exception {
		List<UserSupplier> jobEntitys = userSupplierRepository.findAll();
		return jobEntitys;
	}

	@Override
	public UserSupplier getUserSupplierById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertSupplier(UserSupplierDTO userSupplierDTO) throws Exception {
		if(userSupplierDTO == null) {
			throw new ResourceNotFoundException("user is null");
		}
		UserSupplier user = modelMapper.map(userSupplierDTO, UserSupplier.class);
		UserSupplier userResult = userSupplierRepository.save(user);
		return userResult != null ? true : false;
	}

}
