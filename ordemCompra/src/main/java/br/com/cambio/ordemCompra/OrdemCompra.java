package br.com.cambio.ordemCompra;

import org.springframework.data.annotation.Id;


public class OrdemCompra {
@Id
    private String cpfCliente;
    private TipoMoeda tipoMoedaEstrangeira;
    private Double valorMoedaEstrangeira;
    private String numeroAgenciaDeRetirada;
}
