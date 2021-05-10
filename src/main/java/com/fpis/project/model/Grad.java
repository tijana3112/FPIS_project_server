package com.fpis.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Grad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGrada;

    private String nazivGrada;

    @OneToOne(fetch = FetchType.EAGER)
    private Drzava drzava;
}
