package com.fpis.project.service;

import com.fpis.project.model.UgovorOOsiguranju;
import com.fpis.project.repository.UgovorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UgovorServiceImpl implements UgovorService{
    @Autowired
    UgovorRepository ugovorRepository;

    @Override
    public List<UgovorOOsiguranju> findAll() {
        return ugovorRepository.findAll();
    }

    @Override
    public List<UgovorOOsiguranju> findByBrojUgovora(Long brojUgovora) {
        return ugovorRepository.findByBrojUgovora(brojUgovora);
    }
}
