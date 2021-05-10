package com.fpis.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ObavestenjeOOsiguranju {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idObavestenja;

    @NotBlank(message = "Morate uneti svrhu obavestenja")
    private String svrhaObavestenja;

    private Date datum;

    @NotNull(message = "Izaberite uplatnicu")
    @OneToOne(fetch = FetchType.EAGER)
    private UplatnicaZaOsiguranje uplatnica;

    @NotNull(message = "Izaberite radnika")
    @OneToOne(fetch = FetchType.EAGER)
    private Radnik radnik;

    @NotNull(message = "Izaberite osiguravajucu kucu")
    @OneToOne(fetch = FetchType.EAGER)
    private OsiguravajucaKuca osiguravajucaKuca;
}
