package com.example.smshub.model;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;





@Entity
@Table(name="creditprofile_data")
public class CustomerCreditProfile {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(columnDefinition = "integer(5)")
	public int profile_id;

	@Column(columnDefinition = "integer(10)")
	private int customer_id; 

	@Column
	//@NotBlank(message = "Credit Limit  is mandatory")
	//@Positive(message="Only Positive values are allowed for Credit limit")
	private double credit_limit;

	@Column(columnDefinition = "integer(1)")
	private int customer_type;

 
	@Column(columnDefinition = "integer(1)")
	private int billing_cycle;

	@Column(columnDefinition = "integer(2)")	
	private int cycle_days;

	@Column
	//@FutureOrPresent(message = "Invalid date entered")
	private Date billing_cycle_begin_date;
            
	@Column
    //@FutureOrPresent(message = "Invalid date entered")
	private Date billing_cycle_end_date;
            
    @Column(columnDefinition = "integer(1)")
    private int threshold_type;

    @Column(columnDefinition = "integer(1)")
    private int currency;

	@Column(columnDefinition = "integer(1)")
	private int auto_activate;

	@Column(columnDefinition = "integer(1)")
	private int auto_deactivate;
	
	@OneToMany(targetEntity = Threshold.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="profile_id",referencedColumnName = "profile_id")
	private List<Threshold> thresholds;

 
	public int getProfile_id() {
        return profile_id;
	}
	public void setProfile_id(int profile_id) {
    	this.profile_id = profile_id;
	}
	public int getCustomer_id() {
        return customer_id;
	}
	public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
	}
	public double getCredit_limit() {
        return credit_limit;
	}
	public void setCredit_limit(double credit_limit) {
        this.credit_limit = credit_limit;
	}
	public int getCustomer_type() {
        return customer_type;
	}
	public void setCustomer_type(int customer_type) {
        this.customer_type = customer_type;
	}
	public int getBilling_cycle() {
        return billing_cycle;
	}
	public void setBilling_cycle(int billing_cycle) {
        this.billing_cycle = billing_cycle;
	}
	public int getCycle_days() {
        return cycle_days;
	}
	public void setCycle_days(int cycle_days) {
        this.cycle_days = cycle_days;
	}
	public Date getBilling_cycle_begin_date() {
        return billing_cycle_begin_date;
	}
	public void setBilling_cycle_begin_date(Date billing_cycle_begin_date) {
        this.billing_cycle_begin_date = billing_cycle_begin_date;
	}
	public Date getBilling_cycle_end_date() {
        return billing_cycle_end_date;
	}
	public void setBilling_cycle_end_date(Date billing_cycle_end_date) {
        this.billing_cycle_end_date = billing_cycle_end_date;
	}
	public int getThreshold_type() {
        return threshold_type;
	}
	public void setThreshold_type(int threshold_type) {
        this.threshold_type = threshold_type;
	}
	public int getCurrency() {
        return currency;
	}
	public void setCurrency(int currency) {
        this.currency = currency;
	}
	public int getAuto_activate() {
        return auto_activate;
	}
	public void setAuto_activate(int auto_activate) {
        this.auto_activate = auto_activate;
	}
	public int getAuto_deactivate() {
        return auto_deactivate;
	}
	public void setAuto_deactivate(int auto_deactivate) {
        this.auto_deactivate = auto_deactivate;
	}
	
	public void setThreshold(List<Threshold> thresholds) {
        this.thresholds=thresholds;
	
	}
	public List<Threshold> getThreshold(){
        return thresholds;
	}

}


 

