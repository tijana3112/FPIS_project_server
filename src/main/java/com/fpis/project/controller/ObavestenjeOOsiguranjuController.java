package com.fpis.project.controller;

import com.fpis.project.model.ObavestenjeOOsiguranju;
import com.fpis.project.service.MapValidationErrorService;
import com.fpis.project.service.ObavestenjeOOsiguranjuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/obavestenjeOOsiguranju")
public class ObavestenjeOOsiguranjuController {
    @Autowired
    ObavestenjeOOsiguranjuServiceImpl obavestenjeOOsiguranjuService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("/createObavestenje")
    public ResponseEntity<?> createObavestenje(@Valid @RequestBody ObavestenjeOOsiguranju obavestenjeOOsiguranju, BindingResult result){
        ResponseEntity<?> errors = mapValidationErrorService.MapValidationService(result);
        if (errors != null) return errors;

        ObavestenjeOOsiguranju obavestenjeOOsiguranju1 = obavestenjeOOsiguranjuService.createObavestenje(obavestenjeOOsiguranju);
        return new ResponseEntity<ObavestenjeOOsiguranju>(obavestenjeOOsiguranju1, HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public List<ObavestenjeOOsiguranju> findAll(){
        return obavestenjeOOsiguranjuService.findAll();
    }

    @GetMapping("/findId/{id}")
    public ResponseEntity<?> findObavestenjeById(@PathVariable Long id){
        ObavestenjeOOsiguranju obavestenjeOOsiguranju = obavestenjeOOsiguranjuService.findObavestenjeById(id);
        return new ResponseEntity<ObavestenjeOOsiguranju>(obavestenjeOOsiguranju, HttpStatus.OK);
    }

    @GetMapping("/findS/{svrha}")
    public List<ObavestenjeOOsiguranju> findObavestenjeById(@PathVariable String svrha){
        return obavestenjeOOsiguranjuService.findBySvrhaObavestenja(svrha);
    }

    @DeleteMapping("delete/{id}")
    public List<ObavestenjeOOsiguranju> deleteObavestenje(@PathVariable Long id){
        return obavestenjeOOsiguranjuService.deleteObavestenje(id);
    }
}
