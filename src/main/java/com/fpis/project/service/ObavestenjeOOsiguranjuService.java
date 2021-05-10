package com.fpis.project.service;

import com.fpis.project.model.ObavestenjeOOsiguranju;

import java.util.List;

public interface ObavestenjeOOsiguranjuService {
    ObavestenjeOOsiguranju createObavestenje(ObavestenjeOOsiguranju obavestenjeOOsiguranju);
    List<ObavestenjeOOsiguranju> deleteObavestenje(Long id);
    List<ObavestenjeOOsiguranju> findAll();
    ObavestenjeOOsiguranju findObavestenjeById(Long id);
    List<ObavestenjeOOsiguranju> findBySvrhaObavestenja(String svrha);
}
