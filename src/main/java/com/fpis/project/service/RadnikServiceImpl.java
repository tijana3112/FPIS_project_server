package com.fpis.project.service;

import com.fpis.project.model.Radnik;
import com.fpis.project.repository.RadnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RadnikServiceImpl implements RadnikService{
    @Autowired
    RadnikRepository radnikRepository;

    @Override
    public List<Radnik> findAll() {
        return radnikRepository.findAll();
    }
}
