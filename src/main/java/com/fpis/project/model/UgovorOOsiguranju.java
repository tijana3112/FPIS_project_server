package com.fpis.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UgovorOOsiguranju {
    @Id
    private Long brojUgovora;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date datum;

    @NotBlank(message = "Morate uneti ko je potpisao ugovor")
    private String potpisao;

    @OneToOne(fetch = FetchType.EAGER)
    private Drzava drzava;

    @OneToOne(fetch = FetchType.EAGER)
    private Radnik radnik;

    @OneToOne(fetch = FetchType.EAGER)
    private OsiguravajucaKuca osiguravajucaKuca;

    @OneToOne(fetch = FetchType.EAGER)
    private OvlascenoLiceOsiguravajuceKuce ovlascenoLiceOsiguravajuceKuce;

    @OneToOne(fetch = FetchType.EAGER)
    private ZahtevZaOsiguranje zahtevZaOsiguranje;
}
