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
import com.example.smshub.model.Threshold;
import com.example.smshub.model.Thresholddto;
import com.example.smshub.service.ThresholdService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/thresholddetails")
public class ThresholdController {
     @Autowired
     private ThresholdService thresholdservice;

     @PostMapping
	 public ApiResponse<Threshold> saveThresholddetails(@RequestBody Thresholddto threshold){
	 return new ApiResponse<>(HttpStatus.OK.value(), "saved successfully.",thresholdservice.save(threshold));
	 }

	 @GetMapping
	 public ApiResponse<List<Threshold>> listThresholddetails(){
	 return new ApiResponse<>(HttpStatus.OK.value(), "list fetched successfully.",thresholdservice.findAll());
	 }

	 @GetMapping("/{id}")
	 public ApiResponse<Threshold> getOne(@PathVariable int id){	
	 return new ApiResponse<>(HttpStatus.OK.value(), " fetched successfully.",thresholdservice.findById(id));
	 }

	 @PutMapping("/{id}")
	 public ApiResponse<Thresholddto> update(@RequestBody Thresholddto threshold) {
	 return new ApiResponse<>(HttpStatus.OK.value(), "updated successfully.",thresholdservice.update(threshold));
	 }


	 @DeleteMapping("/{id}")
	 public ApiResponse<Void> delete(@PathVariable int id) {
     thresholdservice.delete(id);
     return new ApiResponse<>(HttpStatus.OK.value(), "deleted successfully.", null);
	 }

}
