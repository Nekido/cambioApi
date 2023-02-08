package br.com.cambio.ordemCompra;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class OrdemCompraController {

    private final OrdemCompraService ordemCompraService;

    public OrdemCompraController(OrdemCompraService ordemCompraService) {
        this.ordemCompraService = ordemCompraService;
    }

    @PostMapping("/ordemCompra")
    public ResponseEntity<OrdemCompra> saveCompra(@RequestBody OrdemCompra ordemCompra) {
        String clearCpf = ordemCompra.getCpfCliente().replaceAll("[\\.-]", "");

        if (clearCpf.isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Não foi informado um CPF válido");
        }
        OrdemCompra compra = ordemCompraService.saveCompra(ordemCompra);
        return new ResponseEntity<>(compra, HttpStatus.CREATED);
    }

}

