package br.org.fundatec.lp2.aulamodel.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class PessoaFisica extends Pessoa {

    @Column(nullable = false)
    private String cpf;

    private LocalDate dataNascimento;
}
