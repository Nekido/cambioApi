package br.com.cambio.ordemCompra;

import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class OrdemCompraService {
    private final OrdemCompraRepository ordemCompraRepository;

    public OrdemCompraService(OrdemCompraRepository ordemCompraRepository) {
        this.ordemCompraRepository = ordemCompraRepository;
    }

    public OrdemCompra saveCompra (OrdemCompra  ordemCompra ) {
        ordemCompraRepository . save ( ordemCompra );
        return ordemCompra;
    }
    public Optional<OrdemCompra> listarCompraPorId (Long  id ) {
            return  ordemCompraRepository . findById(id);
    }
    public  void  deletarCompraPorId ( Long id  ) {
        ordemCompraRepository. deleteById ( id );
    }

}
