package com.example.smshub.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;

import com.example.smshub.model.CustomerCreditProfile;
import com.example.smshub.model.CustomerDetails;




public interface CustomerCreditProfiledao extends JpaRepository<CustomerCreditProfile,Integer>{
       @Query(value ="select p.profile_id,c.name,c.customer_status from customer_details c JOIN creditprofile_data p ON c.customer_id=p.customer_id", nativeQuery=true)
       List<Object[]> findAllcredits();
       
}

