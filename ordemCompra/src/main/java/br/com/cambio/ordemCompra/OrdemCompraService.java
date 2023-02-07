package br.com.cambio.ordemCompra;

import br.com.cotacao.EconomiaService;
import org.springframework.stereotype.Service;

import java.util.List;
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
