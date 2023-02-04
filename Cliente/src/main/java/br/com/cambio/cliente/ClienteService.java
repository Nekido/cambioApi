package br.com.cambio.cliente;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository funcionarioRepository) {
        this.clienteRepository = funcionarioRepository;
    }

    public Cliente salvar(Cliente funcionario) {
        return clienteRepository.save(funcionario);
    }

    public List<Cliente> listar() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public void deletarPorID(Long id) {
        clienteRepository.deleteById(id);
    }

}
