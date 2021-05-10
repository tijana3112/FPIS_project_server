package com.fpis.project.service;

import com.fpis.project.model.UplatnicaZaOsiguranje;
import com.fpis.project.repository.UplatnicaZaORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UplatnicaZaOServiceImpl implements UplatnicaZaOService {
    @Autowired
    UplatnicaZaORepository uplatnicaZaORepository;

    @Override
    public List<UplatnicaZaOsiguranje> findAll() {
        return uplatnicaZaORepository.findAll();
    }

    @Override
    public List<UplatnicaZaOsiguranje>  findByIdUplatnice(Long id) {
        return uplatnicaZaORepository.findByIdUplatnice(id);
    }

    @Override
    public List<UplatnicaZaOsiguranje> findBySvrhaUplate(String svrha) {
        return uplatnicaZaORepository.findBySvrhaUplateContains(svrha);
    }

    @Override
    public List<UplatnicaZaOsiguranje> findByIdAndSvrha(Long id, String svrha) {
        return uplatnicaZaORepository.searchByIdUplatniceSvrhaLike(id,svrha);
    }
}
