/**
 * 
 */
package com.elcom.gasscale.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elcom.gasscale.dto.UserSupplierDTO;
import com.elcom.gasscale.entities.UserSupplier;
import com.elcom.gasscale.model.ResponseResult;
import com.elcom.gasscale.service.UserSupplierService;

/**
 * @author cuongcv
 *
 */
@RestController
@RequestMapping("api/user-supplier")
public class UserSupplierController extends GeneralController {
	
	private final UserSupplierService userSupplierService;
	
	@Autowired
	public UserSupplierController(UserSupplierService userSupplierService) {
		this.userSupplierService = userSupplierService;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<ResponseResult> getAll(){
		ResponseResult responseResult = new ResponseResult();
		try {
			List<UserSupplier> users = userSupplierService.getAllUserSupplier();
			if(!users.isEmpty()) {
				responseResult.setSuccess(true);
				responseResult.setMessage(getDataSuccess);
				responseResult.setData(users);
			} else {
				responseResult.setSuccess(true);
				responseResult.setMessage(getDataError);
			}
		} catch (Exception e) {
			responseResult.setSuccess(false);
			responseResult.setMessage(e.getMessage());
			responseResult.setError(e);
		}
		return ResponseEntity.ok(responseResult);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public ResponseEntity<ResponseResult> insert(@RequestBody @Valid UserSupplierDTO userSupplierDTO, BindingResult bindingResult){
		ResponseResult responseResult = new ResponseResult();
		try {
			if(!bindingResult.hasErrors()) {
				if(userSupplierService.insertSupplier(userSupplierDTO)) {
					responseResult.setSuccess(true);
					responseResult.setMessage(insertSuccess);
				} else {
					responseResult.setMessage(insertError);
				}
			}else {
				responseResult.setSuccess(false);
				responseResult.setError(bindingResult.getFieldError());
				responseResult.setMessage(messageErrorTotal + bindingResult.getErrorCount());
			}
		} catch (Exception e) {
			responseResult.setSuccess(false);
			responseResult.setMessage(e.getMessage());
			responseResult.setError(e);
		}
		return ResponseEntity.ok(responseResult);
	}
}
