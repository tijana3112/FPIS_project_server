package com.fpis.project.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class RacunOsiguranja {
    @Id
    private Long brojRacuna;

    private Date datum;

    @NotBlank(message = "Morate izracunati ukupan iznos")
    private  double iznos;

    @NotBlank(message = "Morate uneti poziv na broj")
    private String pozivNaBroj;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "racunOsiguranja")
    @JsonManagedReference
    private List<StavkaRacunaO> stavke = new ArrayList<>();

    @NotNull(message = "Izaberite ugovor")
    @OneToOne(fetch = FetchType.EAGER)
    private UgovorOOsiguranju ugovorOOsiguranju;

    @OneToOne(fetch = FetchType.EAGER)
    private OsiguravajucaKuca osiguravajucaKuca;

    @NotNull(message = "Izaberite ovlasceno lice osiguravajuce kuce")
    @OneToOne(fetch = FetchType.EAGER)
    private OvlascenoLiceOsiguravajuceKuce ovlascenoLiceOsiguravajuceKuce;

    @NotNull(message = "Izaberite nacin placanja")
    @OneToOne(fetch = FetchType.EAGER)
    private NacinPlacanja nacinPlacanja;

    private String status;
}
