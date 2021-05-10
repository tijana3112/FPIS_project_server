package com.fpis.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class NacinPlacanja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNacinaPlacanja;

    private String opisNacinaPlacanja;
}
