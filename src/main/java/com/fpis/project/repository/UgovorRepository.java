package com.fpis.project.repository;

import com.fpis.project.model.UgovorOOsiguranju;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UgovorRepository extends JpaRepository<UgovorOOsiguranju, Long> {
    List<UgovorOOsiguranju> findByBrojUgovora(Long brojUgovora);
}
