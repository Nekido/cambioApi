package br.com.cambio.cliente;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listar() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Optional<Cliente> buscarPorCpf(@PathVariable String cpf) {
        List<Cliente> listaClientes = (List<Cliente>) clienteRepository.findAll();
        Optional<Cliente> resultado = listaClientes.stream().filter(c -> c.getCpf().equals(cpf)).findFirst();
        if (resultado.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Não existe cliente com este CPF");
        } else {
            return resultado;
        }
    }

    public void deletarPorID(Long id) {
        clienteRepository.deleteById(id);
    }

}
