package com.fpis.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OvlascenoLiceOsiguravajuceKuce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sifraOL;

    @OneToOne(fetch = FetchType.EAGER)
    private OsiguravajucaKuca osiguravajucaKuca;

    private String imePrezime;
}
