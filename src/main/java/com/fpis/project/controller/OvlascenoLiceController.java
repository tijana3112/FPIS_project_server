package com.fpis.project.controller;

import com.fpis.project.model.OvlascenoLiceOsiguravajuceKuce;
import com.fpis.project.service.OvlascenoLiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ovlascenoLice")
public class OvlascenoLiceController {
    @Autowired
    OvlascenoLiceServiceImpl ovlascenoLiceService;

    @GetMapping("/findAll")
    public List<OvlascenoLiceOsiguravajuceKuce> findAll(){
        return ovlascenoLiceService.findAll();
    }
}
