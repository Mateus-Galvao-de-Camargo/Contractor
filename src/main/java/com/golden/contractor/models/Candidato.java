package com.golden.contractor.models;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Candidato {

    @Id
    @GeneratedValue
    @Getter
    private long id;

    @Column(unique = true)
    @Getter
    @Setter
    private String rg;

    @NotEmpty
    @Getter
    @Setter
    private String nomeCandidato;

    @NotEmpty
    @Getter
    @Setter
    private String email;

    @ManyToOne
    @Getter
    @Setter
    private Vaga vaga;

}
