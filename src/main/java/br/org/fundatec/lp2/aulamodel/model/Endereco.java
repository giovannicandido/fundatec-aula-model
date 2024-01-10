package br.org.fundatec.lp2.aulamodel.model;

import br.org.fundatec.lp2.aulamodel.AulaModelApplication;
import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idQualquer;

    private String logradouro;

    private String bairro;

    private String cidade;

    private Integer numero;

}
