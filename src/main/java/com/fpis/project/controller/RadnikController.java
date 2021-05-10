package com.fpis.project.controller;

import com.fpis.project.model.Radnik;
import com.fpis.project.model.UplatnicaZaOsiguranje;
import com.fpis.project.service.RadnikServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/radnik")
public class RadnikController {
    @Autowired
    RadnikServiceImpl radnikService;

    @GetMapping("/findAll")
    public List<Radnik> findAll(){
        return radnikService.findAll();
    }
}
