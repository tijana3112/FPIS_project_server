package com.fpis.project.service;

import com.fpis.project.model.OsiguravajucaKuca;
import com.fpis.project.repository.OsigKucaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OsigKucaServiceImpl implements OsigKucaService{
    @Autowired
    OsigKucaRepository osigKucaRepository;

    @Override
    public List<OsiguravajucaKuca> findAll() {
        return osigKucaRepository.findAll();
    }
}
