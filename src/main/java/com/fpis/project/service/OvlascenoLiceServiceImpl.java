package com.fpis.project.service;

import com.fpis.project.model.OvlascenoLiceOsiguravajuceKuce;
import com.fpis.project.repository.OvlascenoLiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OvlascenoLiceServiceImpl implements OvlascenoLiceService{

    @Autowired
    OvlascenoLiceRepository ovlascenoLiceRepository;

    @Override
    public List<OvlascenoLiceOsiguravajuceKuce> findAll() {
        return ovlascenoLiceRepository.findAll();
    }

    @Override
    public OvlascenoLiceOsiguravajuceKuce findById(Long id) {
        return ovlascenoLiceRepository.findBySifraOL(id);
    }
}
