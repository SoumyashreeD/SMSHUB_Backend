package com.example.smshub.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smshub.dao.Thresholddao;
import com.example.smshub.model.CustomerCreditProfile;
import com.example.smshub.model.Threshold;
import com.example.smshub.model.Thresholddto;
import com.example.smshub.service.ThresholdService;

@Transactional
@Service(value ="ThresholdService")
public class ThresholdImpl implements ThresholdService{
    @Autowired
    private Thresholddao thresholddao;
    
    public List<Threshold> findAll() {
        List<Threshold> list = new ArrayList<>();
        thresholddao.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
    @Override
    public void delete(int id) {
                thresholddao.deleteById(id);
    }
    @Override
    public Threshold findById(int profile_id) {
        Optional<Threshold> optionalUser =thresholddao.findById(profile_id);
        return optionalUser.isPresent() ? optionalUser.get() : null;
    }

    @Override
    public Thresholddto update(Thresholddto threshold) {
    Threshold c = findById(threshold.getThreshold_id());
    if(c != null) {
        BeanUtils.copyProperties(threshold, c, "password", "username");
        thresholddao.save(c);
	}
    return threshold;
    }

    public Threshold save(Thresholddto threshold) {
    Threshold n1 = new Threshold();
     return thresholddao.save(n1);
    }
}

