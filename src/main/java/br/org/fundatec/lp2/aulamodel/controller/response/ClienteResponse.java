package br.org.fundatec.lp2.aulamodel.controller.response;

import br.org.fundatec.lp2.aulamodel.model.Cliente;
import lombok.Builder;
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
@Builder
public class ClienteResponse {

    private Integer id;

    private String nome;

//    @JsonProperty("cpfBR")
    private String cpf;

    private List<EnderecoResponse> endereco;

    public static ClienteResponse of(Cliente cliente) {
        return ClienteResponse.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .cpf(cliente.getCpf())
//                .endereco(
//                        cliente.getEndereco().stream
//                )
                .build();
    }
}
