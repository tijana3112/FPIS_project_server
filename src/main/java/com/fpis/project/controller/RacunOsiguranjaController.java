package com.fpis.project.controller;

import com.fpis.project.model.ObavestenjeOOsiguranju;
import com.fpis.project.model.OvlascenoLiceOsiguravajuceKuce;
import com.fpis.project.model.RacunOsiguranja;
import com.fpis.project.model.StavkaRacunaO;
import com.fpis.project.service.OvlascenoLiceServiceImpl;
import com.fpis.project.service.RacunOsiguranjaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/racunZaOsiguranje")
public class RacunOsiguranjaController {
    @Autowired
    RacunOsiguranjaServiceImpl racunOsiguranjaService;

    @Autowired
    OvlascenoLiceServiceImpl ovlascenoLiceService;

    @PostMapping("/createRacun")
    @Transactional
    public ResponseEntity<?> createRacun(@Valid @RequestBody RacunOsiguranja racunOsiguranja, BindingResult result){
        OvlascenoLiceOsiguravajuceKuce o = ovlascenoLiceService.findById(racunOsiguranja.getOvlascenoLiceOsiguravajuceKuce().getSifraOL());
        racunOsiguranja.setOsiguravajucaKuca(o.getOsiguravajucaKuca());
        if(racunOsiguranja.getStatus() == null) {
            racunOsiguranja.setStatus("Formiran");
        }
        RacunOsiguranja racunOsiguranja1 = racunOsiguranjaService.createRacun(racunOsiguranja);
        return new ResponseEntity<RacunOsiguranja>(racunOsiguranja1, HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public List<RacunOsiguranja> findAll(){
        return racunOsiguranjaService.findAll();
    }

    @GetMapping("/findId/{id}")
    public List<RacunOsiguranja>  findRacunById(@PathVariable Long id){
        return racunOsiguranjaService.findRacunByBrojRacuna(id);
    }

    @GetMapping("/{id}")
    public RacunOsiguranja findRacun(@PathVariable Long id){
        RacunOsiguranja racunOsiguranja = racunOsiguranjaService.findRacun(id);
        racunOsiguranja.setStavke(racunOsiguranja.getStavke());
        return racunOsiguranja;
    }

    @DeleteMapping("delete/{id}")
    public List<RacunOsiguranja> deleteRacun(@PathVariable Long id){
        return racunOsiguranjaService.deleteRacun(id);
    }

    @DeleteMapping("deleteStavka/{id}")
    public void deleteStavka(@PathVariable Long id){
        racunOsiguranjaService.deleteStavka(id);
    }

    @PostMapping("/createStavka")
    public StavkaRacunaO createStavka(@Valid @RequestBody StavkaRacunaO stavkaRacunaO, BindingResult result){
        StavkaRacunaO stavkaRacunaO1 = racunOsiguranjaService.createStavka(stavkaRacunaO);
        return stavkaRacunaO1;
    }
}
