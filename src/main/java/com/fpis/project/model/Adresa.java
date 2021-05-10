package com.fpis.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Adresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdrese;

    @OneToOne(fetch = FetchType.EAGER)
    private Grad grad;

    @OneToOne(fetch = FetchType.EAGER)
    private Drzava drzava;

    private String ulica;
    private String broj;
}
