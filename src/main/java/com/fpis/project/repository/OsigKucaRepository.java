package com.fpis.project.repository;

import com.fpis.project.model.OsiguravajucaKuca;
import com.fpis.project.model.Radnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OsigKucaRepository extends JpaRepository<OsiguravajucaKuca, Long> {
}
