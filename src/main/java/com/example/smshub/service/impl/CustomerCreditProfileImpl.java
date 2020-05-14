package com.example.smshub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smshub.dao.CustomerCreditProfiledao;
import com.example.smshub.model.CustomerCreditProfile;
import com.example.smshub.model.CustomerCreditProfiledto;
import com.example.smshub.model.CustomerDetails;
import com.example.smshub.model.Threshold;
import com.example.smshub.service.CustomerCreditProfileService;

@Transactional
@Service(value ="CustomerCreditProfileService")
public class CustomerCreditProfileImpl implements CustomerCreditProfileService{
     @Autowired
     private CustomerCreditProfiledao ccpdao;
     
     public List< CustomerCreditProfile> findAll() {
         List<CustomerCreditProfile> list = new ArrayList<>();
         ccpdao.findAll().iterator().forEachRemaining(list::add);
         return list;
     }
     @Override
     public void delete(int id) {
         ccpdao.deleteById(id);
     }
     @Override
     public CustomerCreditProfile findById(int profile_id) {
         Optional<CustomerCreditProfile> optionalUser =ccpdao.findById(profile_id);
         return optionalUser.isPresent() ? optionalUser.get() : null;
     }

     @Override
     public CustomerCreditProfiledto update(CustomerCreditProfiledto ccp) {
	    CustomerCreditProfile c = findById(ccp.getProfile_id());
	    if(c != null) {
	    BeanUtils.copyProperties(ccp, c, "password", "username");
	    ccpdao.save(c);
	    }
	    return ccp;
	 }	
     public CustomerCreditProfile save(CustomerCreditProfiledto ccp) {
    	 CustomerCreditProfile n = new CustomerCreditProfile();
         n.setCustomer_id(ccp.getCustomer_id());
         n.setCredit_limit(ccp. getCredit_limit());
         n.setCustomer_type(ccp.getCustomer_type() );
         n.setBilling_cycle(ccp. getBilling_cycle());
         n.setCycle_days(ccp.getCycle_days());
         n.setBilling_cycle_begin_date(ccp.getBilling_cycle_begin_date());
         n.setBilling_cycle_end_date(ccp.getBilling_cycle_end_date());
         n.setThreshold_type(ccp.getThreshold_type());
         n.setCurrency(ccp.getCurrency());
         n.setAuto_activate(ccp.getAuto_activate());
         n.setAuto_deactivate(ccp.getAuto_deactivate());
         n.setThreshold(ccp.getThreshold());
         return ccpdao.save(n);
     }

     @Override
     public List<Object[]> findAllcredits() {
        List<Object[]> list = new ArrayList<>();
        ccpdao.findAllcredits().iterator().forEachRemaining(list::add);
        return list;
     }
}

