package br.org.fundatec.lp2.aulamodel.controller;


import br.org.fundatec.lp2.aulamodel.controller.request.ClienteRequest;
import br.org.fundatec.lp2.aulamodel.controller.response.ClienteResponse;
import br.org.fundatec.lp2.aulamodel.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v0/clientes")
public class ClienteController {

    private List<Cliente> clientes = new ArrayList<>();


    @GetMapping
    public List<ClienteResponse> listaClientes(@RequestParam(required = false) String nome) {

        return clientes.stream()
                .map(ClienteResponse::of)
                .toList();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarCliente(@RequestBody ClienteRequest clienteRequest) {
        this.clientes.add(clienteRequest.toModel());
    }
}
