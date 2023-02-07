package br.com.cambio.ordemCompra;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class OrdemCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long idCliente;
    private String cpfCliente;
    private LocalDate dataSolicitacao;
    private TipoMoeda tipoMoedaEstrangeira;
    private Double valorMoedaEstrangeira;
    private Double valorCotacao;
    private Double valorTotalOperacao;
    private String numeroAgenciaDeRetirada;
}
