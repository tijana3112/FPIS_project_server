package com.fpis.project.repository;

import com.fpis.project.model.ObavestenjeOOsiguranju;
import com.fpis.project.model.UgovorOOsiguranju;
import com.fpis.project.model.UplatnicaZaOsiguranje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UplatnicaZaORepository extends JpaRepository<UplatnicaZaOsiguranje, Long> {
    List<UplatnicaZaOsiguranje> findByIdUplatnice(Long idObavestenja);
    List<UplatnicaZaOsiguranje> findBySvrhaUplateContains(String svrha);
    @Query("SELECT u FROM UplatnicaZaOsiguranje u WHERE u.idUplatnice=:id and u.svrhaUplate LIKE %:svrha%")
    List<UplatnicaZaOsiguranje> searchByIdUplatniceSvrhaLike(@Param("id") Long id, @Param("svrha") String svrha);
}
