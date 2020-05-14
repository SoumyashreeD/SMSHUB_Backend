package com.example.smshub.service;

import java.util.List;

import com.example.smshub.model.CustomerCreditProfile;
import com.example.smshub.model.CustomerCreditProfiledto;


public interface CustomerCreditProfileService {
    CustomerCreditProfile save(CustomerCreditProfiledto ccp);
    
    List<CustomerCreditProfile> findAll();
    
    void delete(int id);

    CustomerCreditProfile findById(int id);

    CustomerCreditProfiledto update(CustomerCreditProfiledto ccp);
    
    List<Object[]> findAllcredits();

}

