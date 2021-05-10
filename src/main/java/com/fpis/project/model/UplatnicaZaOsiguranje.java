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
public class UplatnicaZaOsiguranje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUplatnice;

    private String svrhaUplate;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date datum;

    private double iznos;

    @OneToOne(fetch = FetchType.EAGER)
    private RacunOsiguranja racunOsiguranja;

    @OneToOne(fetch = FetchType.EAGER)
    private Model model;
    @OneToOne(fetch = FetchType.EAGER)
    private Valuta valuta;

    @OneToOne(fetch = FetchType.EAGER)
    private Radnik radnik;

    @OneToOne(fetch = FetchType.EAGER)
    private Korisnik korisnik;

}
