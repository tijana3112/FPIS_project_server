package com.fpis.project.service;

import com.fpis.project.model.ObavestenjeOOsiguranju;
import com.fpis.project.model.UplatnicaZaOsiguranje;

import java.util.List;

public interface UplatnicaZaOService {
    List<UplatnicaZaOsiguranje> findAll();
    List<UplatnicaZaOsiguranje>  findByIdUplatnice(Long id);
    List<UplatnicaZaOsiguranje> findBySvrhaUplate(String svrha);
    List<UplatnicaZaOsiguranje> findByIdAndSvrha(Long id, String svrha);
}
