package com.golden.contractor.models;

import java.io.Serializable;

import  java.util.List;

import jakarta.persistence.CascadeType; //se deletar uma vaga esse import serve para deletar todas
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.validation.constraints.NotEmpty;

public class Vaga implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    @NotEmpty
    private String nome;

    @NotEmpty
    private String data;

    @NotEmpty
    private String salario;

    @OneToMany(mappedBy = "vaga", cascade = CascadeType.REMOVE)
    private List<Candidato> candidatos;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(@NotEmpty long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(@NotEmpty String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(@NotEmpty String data) {
        this.data = data;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(@NotEmpty String salario) {
        this.salario = salario;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
}
