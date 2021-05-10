package com.fpis.project.repository;

import com.fpis.project.model.NacinPlacanja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NacinPlacanjaRepository extends JpaRepository<NacinPlacanja, Long> {
}
