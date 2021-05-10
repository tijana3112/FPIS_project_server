package com.fpis.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OsiguravajucaKuca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOsigKuce;

    private String nazivOsigKuce;
    private String brTekucegRac;
    private String telefonOsigKuce;

    @OneToOne(fetch = FetchType.EAGER)
    private Adresa adresa;
}
