package com.accenture.nearby.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.nearby.entity.Customer;
import com.accenture.nearby.entity.Merchant;
import com.accenture.nearby.service.MerchantService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin
@RestController
@Slf4j
@Api(value = "MerchantController", produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping("/merchants")
public class MerchantController {

	@Autowired
	private MerchantService merchantService;

	@RequestMapping(path = "/getAllMerchant/{activeFlag}", method = RequestMethod.GET)
	@ApiOperation("Get the all resitered customer list")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Merchant.class) })
	public ResponseEntity<List<Merchant>> getAllMerchantsList(@PathVariable(name = "activeFlag") boolean activeFlag) {
		log.info("Enter into getAllMerchantsList() :: MerchantController");
		List<Merchant> merchantList = merchantService.getAllMerchantsList(activeFlag);
		log.info("Exit from getAllMerchantsList() :: MerchantController");
		if (merchantList != null && !merchantList.isEmpty())
			return new ResponseEntity<List<Merchant>>(merchantList, HttpStatus.OK);
		return new ResponseEntity<List<Merchant>>(merchantList, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
