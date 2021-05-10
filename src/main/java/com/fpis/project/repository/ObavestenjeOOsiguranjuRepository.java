package com.fpis.project.repository;

import com.fpis.project.model.ObavestenjeOOsiguranju;
import com.fpis.project.model.UplatnicaZaOsiguranje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ObavestenjeOOsiguranjuRepository  extends JpaRepository<ObavestenjeOOsiguranju, Long> {
    Optional<ObavestenjeOOsiguranju> findByIdObavestenja(Long idObavestenja);
    List<ObavestenjeOOsiguranju> findBySvrhaObavestenjaContains(String svrha);
}
