package com.fatec.exemplo.apiusuarios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @GeneratedValue
    private Long cod_cli;
    private String nome;
    private String email;
    private LocalDate data_nascimento;
    private String cpf;
    private String telefone;
    private String rg;
}
