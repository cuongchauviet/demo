/**
 * 
 */
package com.elcom.gasscale.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author cuongcv
 *
 */
@Configuration
@PropertySource("classpath:messages.properties")
public class GeneralController {
	//success
	@Value("${insert.success}")
	protected String insertSuccess;
	
	@Value("${update.success}")
	protected String updateSuccess;
	
	@Value("${delete.success}")
	protected String deleteSuccess;
	
	@Value("${get.data.success}")
	protected String getDataSuccess;
	
	// error
	@Value("${insert.error}")
	protected String insertError;
	
	@Value("${update.error}")
	protected String updateError;
	
	@Value("${delete.error}")
	protected String deleteError;
	
	@Value("${get.data.error}")
	protected String getDataError;
	
	@Value("${message.error.total}")
	protected String messageErrorTotal;
	
	@Value("${get.data.null}")
	protected String getDataNull;
	
}
