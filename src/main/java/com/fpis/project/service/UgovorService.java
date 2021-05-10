package com.fpis.project.service;

import com.fpis.project.model.UgovorOOsiguranju;

import java.util.List;

public interface UgovorService {
    List<UgovorOOsiguranju> findAll();
    List<UgovorOOsiguranju> findByBrojUgovora(Long brojUgovora);
}
