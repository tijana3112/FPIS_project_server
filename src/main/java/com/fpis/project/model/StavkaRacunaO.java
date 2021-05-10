package com.fpis.project.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StavkaRacunaO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sifraStavke;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brojRacuna", updatable = false)
    @JsonBackReference
    private RacunOsiguranja racunOsiguranja;

    @NotBlank(message = "Morate uneti naziv vrste osiguranja")
    private String nazivVrsteOsig;
    @NotBlank(message = "Morate uneti cenu")
    private double cena;

}
