package com.fpis.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ZahtevZaOsiguranje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sifraZahteva;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date datum;

    private String napomena;

    @OneToOne(fetch = FetchType.EAGER)
    private ObavestenjeOOsiguranju obavestenjeOOsiguranju;

    @OneToOne(fetch = FetchType.EAGER)
    private OsiguravajucaKuca osiguravajucaKuca;

    @OneToOne(fetch = FetchType.EAGER)
    private Radnik radnik;
}

