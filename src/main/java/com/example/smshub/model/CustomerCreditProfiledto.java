
package com.example.smshub.model;

import java.sql.Date;
import java.util.List;
public class CustomerCreditProfiledto {

        public int profile_id;
        private int customer_id;
        private double credit_limit;
        private int customer_type;
        private int billing_cycle;
        private int cycle_days;
        private Date billing_cycle_begin_date;
        private Date billing_cycle_end_date;
        private int threshold_type;
        private int currency;
        private int auto_activate;
        private int auto_deactivate;

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
        
        public List<Threshold> threshold;
        public int getThreshold_level;
        
        public String getThreshold_message;
        
        public List<Threshold> getThreshold(){
            return threshold;
        }
        public void setThreshold(List<Threshold> threshold) {
            this.threshold=threshold;
        }
        public double getThreshold_value() {
                        // TODO Auto-generated method stub
            return 0;
        }
                
}
