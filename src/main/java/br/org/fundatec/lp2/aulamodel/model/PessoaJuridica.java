package br.org.fundatec.lp2.aulamodel.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Getter
@Setter
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    private String socios;

    private BigInteger capital;

}
