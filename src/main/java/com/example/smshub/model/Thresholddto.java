package com.example.smshub.model;



public class Thresholddto {
       private int threshold_id;
       
       private int profile_id;
       private int threshold_level;
       private double threshold_value;
       private String threshold_message;
       public int getThreshold_id() {
           return threshold_id;
       }
       public void setThreshold_id(int threshold_id) {
           this.threshold_id = threshold_id;
       }
       public int getProfile_id() {
              return profile_id;
       }
       public void setProfile_id(int profile_id) {
              this.profile_id = profile_id;
       }
       
       public CustomerCreditProfile profile;
       
       CustomerCreditProfile getProfile() {
             return profile;
       }
       public void setProfile(CustomerCreditProfile profile) {
             this.profile=profile;
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

