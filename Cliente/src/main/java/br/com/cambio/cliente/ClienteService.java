package br.com.cambio.cliente;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listar() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente buscarPorCpf(@PathVariable String cpf) {
        Cliente resultadoBuscaCpf = new Cliente();
        List<Cliente> listaClientes = (List<Cliente>) clienteRepository.findAll();
        for (Cliente c : listaClientes) {
            if (c.getCpf().equals(cpf)) {
                resultadoBuscaCpf = c;
            }
        }
        return resultadoBuscaCpf;
    }

    public void deletarPorID(Long id) {
        clienteRepository.deleteById(id);
    }

}
