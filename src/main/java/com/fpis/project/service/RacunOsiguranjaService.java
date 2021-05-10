package com.fpis.project.service;

import com.fpis.project.model.RacunOsiguranja;

import java.util.List;

public interface RacunOsiguranjaService {
    RacunOsiguranja createRacun(RacunOsiguranja racunOsiguranja);
    List<RacunOsiguranja> deleteRacun(Long brojRacuna);
    List<RacunOsiguranja> findAll();
    List<RacunOsiguranja> findRacunByBrojRacuna(Long brojRacuna);
}
