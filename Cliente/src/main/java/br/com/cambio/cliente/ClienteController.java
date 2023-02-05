package br.com.cambio.cliente;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping()
    public Cliente salvar(@RequestBody Cliente funcionario) {
        return clienteService.salvar(funcionario);
    }

    @GetMapping()
    public List<Cliente> listar() {
        return clienteService.listar();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return clienteService.buscarPorId(id);
    }

    @GetMapping("/cpf/{cpf}")
    public Cliente buscarPorCpf(@PathVariable String cpf) {
        return clienteService.buscarPorCpf(cpf);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        clienteService.deletarPorID(id);
    }

}
