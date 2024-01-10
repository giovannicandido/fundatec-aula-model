package br.org.fundatec.lp2.aulamodel.controller.response;

import lombok.Data;

/**
 * "logradouro": "Av. Ipiranga",
 *  *         "numero": 1200,
 *  *         "bairro": "Jardim Carvalho",
 *  *         "cidade": "Porto Alegre",
 *  *         "estado": "RS"
 */
@Data
public class EnderecoResponse {
    private Integer id;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
}
