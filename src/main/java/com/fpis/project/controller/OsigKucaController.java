package com.fpis.project.controller;

import com.fpis.project.model.OsiguravajucaKuca;
import com.fpis.project.model.Radnik;
import com.fpis.project.repository.OsigKucaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/osigKuca")
public class OsigKucaController {
    @Autowired
    OsigKucaRepository osigKucaRepository;

    @GetMapping("/findAll")
    public List<OsiguravajucaKuca> findAll(){
        return osigKucaRepository.findAll();
    }
}
