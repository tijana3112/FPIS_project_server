package com.fpis.project.repository;

import com.fpis.project.model.StavkaRacunaO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StavkaRacunaRepository extends JpaRepository<StavkaRacunaO, Long> {
}
