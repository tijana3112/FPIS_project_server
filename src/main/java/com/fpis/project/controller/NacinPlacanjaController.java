package com.fpis.project.controller;

import com.fpis.project.model.NacinPlacanja;
import com.fpis.project.service.NacinPlacanjaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nacinPlacanja")
public class NacinPlacanjaController {
    @Autowired
    NacinPlacanjaServiceImpl nacinPlacanjaService;

    @GetMapping("/findAll")
    public List<NacinPlacanja> findAll(){
        return nacinPlacanjaService.findAll();
    }
}
