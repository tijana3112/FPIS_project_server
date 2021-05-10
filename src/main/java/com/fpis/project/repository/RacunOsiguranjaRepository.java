package com.fpis.project.repository;

import com.fpis.project.model.RacunOsiguranja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RacunOsiguranjaRepository extends JpaRepository<RacunOsiguranja, Long> {
    List<RacunOsiguranja> findByBrojRacuna(Long brojRacuna);
}
