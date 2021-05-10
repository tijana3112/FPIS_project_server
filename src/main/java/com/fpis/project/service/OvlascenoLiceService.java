package com.fpis.project.service;

import com.fpis.project.model.OvlascenoLiceOsiguravajuceKuce;

import java.util.List;

public interface OvlascenoLiceService {
    List<OvlascenoLiceOsiguravajuceKuce> findAll();
    OvlascenoLiceOsiguravajuceKuce findById(Long id);
}
