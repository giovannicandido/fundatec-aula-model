package br.org.fundatec.lp2.aulamodel.controller.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProdutoResponse {
    private Integer valor;
    private String nome;
    private String descricao;
    private Integer quantidadeAtual;
}
