package br.org.fundatec.lp2.aulamodel.controller.request;

import br.org.fundatec.lp2.aulamodel.model.Cliente;
import lombok.Data;

import java.util.List;

/**
 * {
 *     "id": 1,
 *     "nome": "Marta",
 *     "cpf": "000.000.000-00",
 *     "endereco": [{
 *         "id": 1,
 *         "logradouro": "Av. Ipiranga",
 *         "numero": 1200,
 *         "bairro": "Jardim Carvalho",
 *         "cidade": "Porto Alegre",
 *         "estado": "RS"
 *     }]
 * }
 */
@Data
public class ClienteRequest {


    private String nome;

//    @JsonProperty("cpfBR")
    private String cpf;

    private EnderecoRequest endereco;

    public Cliente toModel() {
        return Cliente.builder()
                .nome(nome)
                .cpf(cpf)
                .endereco(endereco.toModel())
                .build();
    }
}
