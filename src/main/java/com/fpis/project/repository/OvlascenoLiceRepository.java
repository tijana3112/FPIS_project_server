package com.fpis.project.repository;

import com.fpis.project.model.OvlascenoLiceOsiguravajuceKuce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OvlascenoLiceRepository extends JpaRepository<OvlascenoLiceOsiguravajuceKuce, Long> {
    OvlascenoLiceOsiguravajuceKuce findBySifraOL(Long id);
}
