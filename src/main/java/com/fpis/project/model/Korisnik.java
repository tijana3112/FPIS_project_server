package com.fpis.project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Korisnik {
    @Id
    @Size(min = 13, max = 13, message = "JMBG mora imati 13 cifara")
    private Long JMBG;

    private String imePrezime;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date datumRodj;

    private Long brPasosa;
    private String brTelefona;

    @OneToOne(fetch = FetchType.EAGER)
    private ObavestenjeOOsiguranju obavestenjeOOsiguranju;

    @OneToOne(fetch = FetchType.EAGER)
    private Adresa adresa;
}
