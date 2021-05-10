package com.fpis.project.service;

import com.fpis.project.model.NacinPlacanja;
import com.fpis.project.repository.NacinPlacanjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NacinPlacanjaServiceImpl implements NacinPlacanjaService {
    @Autowired
    NacinPlacanjaRepository nacinPlacanjaRepository;

    @Override
    public List<NacinPlacanja> findAll() {
        return nacinPlacanjaRepository.findAll();
    }
}
