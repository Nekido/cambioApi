package br.com.cambio.ordemCompra;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class OrdemCompra {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String cpfCliente;
    private TipoMoeda tipoMoedaEstrangeira;
    private Double valorMoedaEstrangeira;
    private String numeroAgenciaDeRetirada;
}
