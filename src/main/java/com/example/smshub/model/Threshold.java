package com.example.smshub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;






@Entity
@Table(name="threshold_data")
public class Threshold {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(columnDefinition = "integer(5)")
	private int threshold_id;
	
	@Column(columnDefinition = "integer(1)")
	@Positive(message="Only Positive values are allowed for Threshold level")
	private int threshold_level;
	
	 
	@Column
	private double threshold_value;
	
	@Column(columnDefinition = "varchar(200)")
	private String threshold_message;
	
	@JsonIgnore
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "profile_id",referencedColumnName = "profile_id",nullable = false,updatable = false)
	public CustomerCreditProfile profile;
	
	public CustomerCreditProfile getProfile() {
        return profile;
	}
	public void setProfile(CustomerCreditProfile profile) {
        this.profile=profile;
	}
	
	 public int getThreshold_id() {
       return threshold_id;
	}
	public void setThreshold_id(int threshold_id) {
		this.threshold_id = threshold_id;
	}
	                                                                           
	public int getThreshold_level() {
        return threshold_level;
	}
	public void setThreshold_level(int threshold_level) {
        this.threshold_level = threshold_level;
	}
	public double getThreshold_value() {
        return threshold_value;
	}
	public void setThreshold_value(double threshold_value) {
        this.threshold_value = threshold_value;
	}
	public String getThreshold_message() {
        return threshold_message;
	}
	public void setThreshold_message(String threshold_message) {
        this.threshold_message = threshold_message;
	}

                                                                                
}


