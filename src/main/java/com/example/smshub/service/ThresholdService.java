package com.example.smshub.service;

import java.util.List;

import com.example.smshub.model.Threshold;
import com.example.smshub.model.Thresholddto;

public interface ThresholdService {
    Threshold save(Thresholddto threshold);
    
    List<Threshold> findAll();
    
    void delete(int id);

    Threshold findById(int profile_id);

    Thresholddto update(Thresholddto threshold);


}

