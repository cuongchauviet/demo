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

import com.elcom.gasscale.dto.GasTankDTO;
import com.elcom.gasscale.entities.GasTank;
import com.elcom.gasscale.model.ResponseResult;
import com.elcom.gasscale.service.GastankService;

/**
 * @author cuongcv
 *
 */
@RestController
@RequestMapping("api/gas-tank")
public class GasTankController extends GeneralController {
	
	private final GastankService gastankService;
	
	@Autowired
	public GasTankController(GastankService gastankService) {
		this.gastankService = gastankService;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<ResponseResult> getAll(){
		ResponseResult responseResult = new ResponseResult();
		try {
			List<GasTank> gastank = gastankService.getAllGastank();
			if(!gastank.isEmpty()) {
				responseResult.setSuccess(true);
				responseResult.setMessage(getDataSuccess);
				responseResult.setData(gastank);
			} else {
				responseResult.setMessage(getDataNull);
			}
		} catch (Exception e) {
			responseResult.setSuccess(false);
			responseResult.setMessage(e.getMessage());
			responseResult.setError(e);
		}
		return ResponseEntity.ok(responseResult);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public ResponseEntity<ResponseResult> insert(@RequestBody @Valid GasTankDTO gasTankDTO, BindingResult bindingResult){
		ResponseResult responseResult = new ResponseResult();
		try {
			if(!bindingResult.hasErrors()) {
				if(gastankService.insert(gasTankDTO)) {
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
