package com.fpis.project.controller;

import com.fpis.project.model.UgovorOOsiguranju;
import com.fpis.project.service.UgovorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ugovorOOsiguranju")
public class UgovorController {
    @Autowired
    UgovorServiceImpl ugovorService;

    @GetMapping("/findAll")
    public List<UgovorOOsiguranju> findAll(){
        return ugovorService.findAll();
    }

    @GetMapping("/find/{id}")
    public List<UgovorOOsiguranju> findByBrojUgovora(@PathVariable Long id) {
        return ugovorService.findByBrojUgovora(id);
    }
}
