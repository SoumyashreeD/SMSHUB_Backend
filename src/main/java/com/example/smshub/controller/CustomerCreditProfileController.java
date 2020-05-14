package com.example.smshub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smshub.model.ApiResponse;
import com.example.smshub.model.CustomerCreditProfile;
import com.example.smshub.model.CustomerCreditProfiledto;
import com.example.smshub.model.CustomerDetails;

import com.example.smshub.service.CustomerCreditProfileService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/profiledetails")
public class CustomerCreditProfileController {
     @Autowired
     private CustomerCreditProfileService ccpservice;

     @PostMapping
	 public ApiResponse<CustomerCreditProfile> saveProfiledetails(@RequestBody CustomerCreditProfiledto ccp){
	 return new ApiResponse<>(HttpStatus.OK.value(), "saved successfully.",ccpservice.save(ccp));
	 }

	 @GetMapping
	 public ApiResponse<List<CustomerCreditProfile>> listProfiledetails(){
	 return new ApiResponse<>(HttpStatus.OK.value(), "list fetched successfully.",ccpservice.findAll());
	 }
	 @GetMapping("/credits")
	 @CrossOrigin
     public ApiResponse<List<Object[]>> listOnlyCustomers(){
     return new ApiResponse<>(HttpStatus.OK.value(), "fetched successfully", ccpservice.findAllcredits());
     }
	 @GetMapping("/{id}")
	 public ApiResponse<CustomerCreditProfile> getOne(@PathVariable int id){
	 return new ApiResponse<>(HttpStatus.OK.value(), " fetched successfully.",ccpservice.findById(id));
	 }
	
	 @PutMapping("/{id}")
	 public ApiResponse<CustomerCreditProfiledto> update(@RequestBody CustomerCreditProfiledto ccp) {
	 return new ApiResponse<>(HttpStatus.OK.value(), "updated successfully.",ccpservice.update(ccp));
	 } 


	 @DeleteMapping("/{id}")
	 public ApiResponse<Void> delete(@PathVariable int id) {
     ccpservice.delete(id);
     return new ApiResponse<>(HttpStatus.OK.value(), "deleted successfully.", null);
	 }

}

