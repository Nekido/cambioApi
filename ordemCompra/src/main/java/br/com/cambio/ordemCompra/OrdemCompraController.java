package br.com.cambio.ordemCompra;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdemCompraController {

    private final OrdemCompraService ordemCompraService;

    public OrdemCompraController(OrdemCompraService ordemCompraService) {
        this.ordemCompraService = ordemCompraService;
    }

        @PostMapping("/ordemCompra")
        public OrdemCompra saveCompra(@RequestBody OrdemCompra ordemCompra) {
            return ordemCompraService.saveCompra(ordemCompra);
        }

        @GetMapping
        public List<OrdemCompra> listarCompra() {
            return ordemCompraService.listarCompra();
        }

    }

