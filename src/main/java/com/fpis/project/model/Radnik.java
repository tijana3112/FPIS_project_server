package com.fpis.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Radnik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sifraRadnika;

    private String imePrezime;
}
