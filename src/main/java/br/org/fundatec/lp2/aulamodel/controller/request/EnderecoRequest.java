package br.org.fundatec.lp2.aulamodel.controller.request;

import br.org.fundatec.lp2.aulamodel.model.Endereco;
import lombok.Data;

/**
 * "logradouro": "Av. Ipiranga",
 *  *         "numero": 1200,
 *  *         "bairro": "Jardim Carvalho",
 *  *         "cidade": "Porto Alegre",
 *  *         "estado": "RS"
 */
@Data
public class EnderecoRequest {
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco toModel() {
        return Endereco.builder()
                .logradouro(logradouro)
                .cidade(cidade)
                .bairro(bairro)
                .numero(numero)
                .build();
    }
}
