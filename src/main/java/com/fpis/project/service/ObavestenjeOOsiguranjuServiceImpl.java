package com.fpis.project.service;

import com.fpis.project.model.ObavestenjeOOsiguranju;
import com.fpis.project.repository.ObavestenjeOOsiguranjuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ObavestenjeOOsiguranjuServiceImpl implements ObavestenjeOOsiguranjuService {
    @Autowired
    ObavestenjeOOsiguranjuRepository obavestenjeOOsiguranjuRepository;

    @Override
    public ObavestenjeOOsiguranju createObavestenje(ObavestenjeOOsiguranju obavestenjeOOsiguranju) {
        return obavestenjeOOsiguranjuRepository.save(obavestenjeOOsiguranju);
    }

    @Override
    public List<ObavestenjeOOsiguranju> deleteObavestenje(Long id) {
        ObavestenjeOOsiguranju obavestenjeOOsiguranju = findObavestenjeById(id);
        obavestenjeOOsiguranjuRepository.delete(obavestenjeOOsiguranju);
        return findAll();
    }

    @Override
    public List<ObavestenjeOOsiguranju> findAll() {
        return obavestenjeOOsiguranjuRepository.findAll();
    }

    @Override
    public ObavestenjeOOsiguranju findObavestenjeById(Long id) {
        Optional<ObavestenjeOOsiguranju> obavestenjeOOsiguranju = obavestenjeOOsiguranjuRepository.findByIdObavestenja(id);
        if(!obavestenjeOOsiguranju.isPresent()){
            throw new RuntimeException("Obavestenje sa datim id ne postoji");
        }
        return obavestenjeOOsiguranju.get();
    }

    @Override
    public List<ObavestenjeOOsiguranju> findBySvrhaObavestenja(String svrha) {
        return obavestenjeOOsiguranjuRepository.findBySvrhaObavestenjaContains(svrha);
    }
}
