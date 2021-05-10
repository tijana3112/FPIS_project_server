package com.fpis.project.controller;

import com.fpis.project.model.UplatnicaZaOsiguranje;
import com.fpis.project.service.UplatnicaZaOServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/uplatnicaZaOsiguranje")
public class UplatnicaZaOController {
    @Autowired
    UplatnicaZaOServiceImpl uplatnicaZaOService;

    @GetMapping("/findAll")
    public List<UplatnicaZaOsiguranje> findAll(){
        return uplatnicaZaOService.findAll();
    }

    @GetMapping("/find/{id}/{svrha}")
    public List<UplatnicaZaOsiguranje> findUplatnicaByIdSvrha(@PathVariable Long id, @PathVariable String svrha){
            return uplatnicaZaOService.findByIdAndSvrha(id,svrha);
    }
    @GetMapping("/findId/{id}")
    public List<UplatnicaZaOsiguranje> findUplatnicaById(@PathVariable Long id){
        return uplatnicaZaOService.findByIdUplatnice(id);
    }
    @GetMapping("/findS/{svrha}")
    public List<UplatnicaZaOsiguranje> findUplatnicaBySvrha(@PathVariable String svrha){
        return uplatnicaZaOService.findBySvrhaUplate(svrha);
    }

}
