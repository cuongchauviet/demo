/**
 * 
 */
package com.elcom.gasscale.service.impl;


import java.util.List;

import javax.persistence.EntityManager;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.elcom.gasscale.dto.UserDTO;
import com.elcom.gasscale.entities.User;
import com.elcom.gasscale.exception.ResourceNotFoundException;
import com.elcom.gasscale.repository.RoleRepository;
import com.elcom.gasscale.repository.UserRepository;
import com.elcom.gasscale.service.UserService;

/**
 * @author cuongcv
 *
 */
@Service
//@Transactional
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	private final EntityManager entityManager;
	
	public UserServiceImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Autowired
    private RoleRepository roleRepository;

    @Autowired 
    private PasswordEncoder passwordEncoder;
    
    @Autowired
	private ModelMapper modelMapper;
    
	@Override
	public User getUserById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.getOne(id);
	}

	@Override
	public void updateUser(User user) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insertUser(UserDTO userDTO) throws ResourceNotFoundException {
		if(userDTO == null) {
			throw new ResourceNotFoundException("user is null");
		}
//		Role role = roleRepository.findByName(userDTO.getRole());
//		HashSet<Role> roles = new HashSet<>();
//        roles.add(roleRepository.findByName(userDTO.getRole()));	            
//		User user = modelMapper.map(userDTO, User.class);
//		user.setRoles(roles);
//		user.setPwd(passwordEncoder.encode(userDTO.getPwd()));
//		
//		User userResult = userRepository.save(user);

		User userResult = null;
		if(userRepository.findByPhone(userDTO.getPhone()) == null) {
//			User user = new User();
//			user.setPhone(userDTO.getPhone());
//			user.setPwd(userDTO.getPwd());
//			user.setFullName(userDTO.getFullName());
////			user.setCreateTime((int)userDTO.getCreateTime());
////			user.setUpdateTime((int)userDTO.getUpdateTime());
//			
//			HashSet<Role> roles = new HashSet<>();
//			roles.add(roleRepository.findByName(userDTO.getRole()));
//			user.setRoles(roles);
//			try {
//				userResult = userRepository.save(user);
//			} catch (IllegalArgumentException e) {
//				System.out.println("ee" + e);
//			}
		} else {
			throw new ResourceNotFoundException("user exist.");
		}
		return userResult != null ? true : false;
	}

	@Override
	public List<User> getAllUser() throws Exception {
		List<User> users = null;
		try {
			users = userRepository.findAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return users;
	}

}
