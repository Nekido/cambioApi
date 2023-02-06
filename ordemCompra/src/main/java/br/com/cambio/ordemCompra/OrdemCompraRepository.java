package br.com.cambio.ordemCompra;

import org.springframework.data.repository.CrudRepository;




    public interface OrdemCompraRepository extends CrudRepository<OrdemCompra, Long> {

        Object listarCompra();
    }


