package com.controller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Landlord;
import com.exception.LandlordNotFoundException;
import com.service.ILandlordService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping(path="/Landlord")
public class LandlordController {
	
	@Autowired
	ILandlordService landlordservice;
	
	
	@PostMapping(path="/add")
	public ResponseEntity<Landlord> addLandlord(@Valid @RequestBody Landlord ld)
	{
		Landlord ld1=landlordservice.addLandlord(ld);
		
		ResponseEntity<Landlord> re =new ResponseEntity<Landlord>(ld1,HttpStatus.OK);
		return re;
	}
	
	@PostMapping(path="/addLandlords")
	public ResponseEntity<List<Landlord>> addLandlords(@Valid @RequestBody List<Landlord> ls)
	{
		List<Landlord> le=this.landlordservice.addLandlords(ls);
		
		ResponseEntity re=new ResponseEntity<List<Landlord>>(le,HttpStatus.OK);
		return re;
	}
	

	  @GetMapping(path="/viewAll") 
	  public ResponseEntity<List<Landlord>>viewAllLandlord() 
	  { 
		   List<Landlord> ll=this.landlordservice.viewAllLandlord();
	  
	  ResponseEntity<List<Landlord>> re=new ResponseEntity<List<Landlord>>(ll,HttpStatus.OK);
	  return re; 
	  }
	  
	  @GetMapping(path="/view/{lid}")
		public ResponseEntity<Optional<Landlord>> viewLandlord(@PathVariable int lid) throws LandlordNotFoundException
		{
			Optional<Landlord> le= landlordservice.viewLandlord(lid);
			
			ResponseEntity<Optional<Landlord>> re=new ResponseEntity<Optional<Landlord>>(le,HttpStatus.OK);
			return re;
		}
	 

		
		  @PutMapping(path="/update") 
		  public ResponseEntity<Landlord>updateLandlord(@Valid @RequestBody Landlord l) throws Exception
		  { 
			  Landlord l1=this.landlordservice.updateLandlord(l); 
			  ResponseEntity<Landlord> re=new ResponseEntity<Landlord>(l1,HttpStatus.OK); return re;
		  
		  }
		  
		  @DeleteMapping(path="/delete") 
		  public ResponseEntity<String>deleteLandlord(@RequestBody Landlord l) throws Exception{
		  landlordservice.deleteLandlord(l);
		  
		  ResponseEntity<String> re= new ResponseEntity<String>("Deleted",HttpStatus.OK); 
		  return re; 
		  }
 
}
