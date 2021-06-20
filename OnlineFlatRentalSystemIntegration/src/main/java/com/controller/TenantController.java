package com.controller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advice.TenantNotFoundException;
import com.entities.Tenant;
import com.service.ITenantService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping(path="/Tenant")
@Validated
public class TenantController {

	@Autowired
	ITenantService tenantservice;
	
	
	@PostMapping(value = "/add" ,consumes = {MediaType.ALL_VALUE})
	public ResponseEntity<Tenant> addTenant( @RequestBody @Valid Tenant tenant)
	{
		Tenant te1=tenantservice.addTenant(tenant);
		
		ResponseEntity<Tenant> rt=new ResponseEntity<Tenant>(te1,HttpStatus.OK);
		return rt;
	}
	
	
	
	@PutMapping(path="/update")
	public ResponseEntity<Tenant> updateTenant( @RequestBody Tenant tenant) throws Exception
	{
		Tenant t1=tenantservice.updateTenant(tenant);
		
		ResponseEntity<Tenant> re=new ResponseEntity<Tenant>(t1,HttpStatus.OK);
		return re;
	}
	
	
	@GetMapping(path="/view")
	public ResponseEntity<List<Tenant>> viewAllTenant()
	{
		List<Tenant> le=tenantservice.viewAllTenant();
		
		ResponseEntity<List<Tenant>> re=new ResponseEntity<List<Tenant>>(le,HttpStatus.OK);
		return re;
	}
	
	
	@GetMapping(path="/view/{id}")
	public ResponseEntity<Tenant> viewTenant(@PathVariable("id") @NotNull int id) throws Exception
	{
		Tenant le=tenantservice.viewTenant(id);
		
		ResponseEntity<Tenant> re=new ResponseEntity<Tenant>(le,HttpStatus.OK);
		return re;
	}
	

	@DeleteMapping(path="/delete")
	public ResponseEntity<String> deleteTenant() throws Exception
	{
		System.out.println("came to controller");
		String res =tenantservice.deleteTenant();
		
		ResponseEntity re=new ResponseEntity<String>(res,HttpStatus.OK);
		return re;
	}
	
	
	@DeleteMapping(path="/delete/{id}")
	public ResponseEntity<String> deleteTenant(@PathVariable  int id) throws Exception
	{
		String le=tenantservice.deleteTenant(id);
		
		ResponseEntity<String> re=new ResponseEntity<String>(le,HttpStatus.OK);
		return re;
	}
}
