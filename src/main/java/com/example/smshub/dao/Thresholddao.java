package com.example.smshub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.smshub.model.Threshold;

public interface Thresholddao extends JpaRepository<Threshold,Integer> {

}

