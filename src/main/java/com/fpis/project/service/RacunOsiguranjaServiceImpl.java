package com.fpis.project.service;

import com.fpis.project.model.RacunOsiguranja;
import com.fpis.project.model.StavkaRacunaO;
import com.fpis.project.repository.RacunOsiguranjaRepository;
import com.fpis.project.repository.StavkaRacunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RacunOsiguranjaServiceImpl implements RacunOsiguranjaService{
    @Autowired
    RacunOsiguranjaRepository racunOsiguranjaRepository;

    @Autowired
    StavkaRacunaRepository stavkaRacunaRepository;

    @Override
    public RacunOsiguranja createRacun(RacunOsiguranja racunOsiguranja) {
        return racunOsiguranjaRepository.save(racunOsiguranja);
    }

    @Override
    public List<RacunOsiguranja> deleteRacun(Long brojRacuna) {
        RacunOsiguranja racunOsiguranja = findRacunByBrojRacuna(brojRacuna).get(0);
        racunOsiguranjaRepository.delete(racunOsiguranja);
        return findAll();
    }

    public void deleteStavka(Long sifraStavke) {
        StavkaRacunaO stavkaRacunaO = stavkaRacunaRepository.findById(sifraStavke).get();
        stavkaRacunaRepository.delete(stavkaRacunaO);
    }

    public StavkaRacunaO createStavka(StavkaRacunaO stavkaRacunaO) {
        return stavkaRacunaRepository.save(stavkaRacunaO);
    }

    @Override
    public List<RacunOsiguranja> findAll() {
        return racunOsiguranjaRepository.findAll();
    }

    @Override
    public List<RacunOsiguranja> findRacunByBrojRacuna(Long brojRacuna) {
        return  racunOsiguranjaRepository.findByBrojRacuna(brojRacuna);
    }

    public RacunOsiguranja findRacun(Long id) {
        Optional<RacunOsiguranja> racunOsiguranja = racunOsiguranjaRepository.findById(id);
        if(!racunOsiguranja.isPresent()){
            throw new RuntimeException("Racun sa datim brojem ne postoji");
        }
        return racunOsiguranja.get();
    }
}
