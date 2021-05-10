package com.fpis.project.repository;

import com.fpis.project.model.Radnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadnikRepository extends JpaRepository<Radnik, Long> {
}
