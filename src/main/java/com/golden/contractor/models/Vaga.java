package com.golden.contractor.models;

import java.io.Serial;
import java.io.Serializable;

import  java.util.List;

import jakarta.persistence.CascadeType; //se deletar uma vaga esse import serve para deletar todas
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Vaga implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private long codigo;

    @NotEmpty
    @Getter
    @Setter
    private String nome;

    @NotEmpty
    @Getter
    @Setter
    private String descricao;

    @NotEmpty
    @Getter
    @Setter
    private String data;

    @NotEmpty
    @Getter
    @Setter
    private String salario;

    @OneToMany(mappedBy = "vaga", cascade = CascadeType.REMOVE)
    @Getter
    @Setter
    private List<Candidato> candidatos;

}
