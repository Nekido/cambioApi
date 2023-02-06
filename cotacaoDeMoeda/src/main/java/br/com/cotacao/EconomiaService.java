package br.com.cotacao;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EconomiaService {
    private RestTemplate restTemplate;
    private final String urlUsd = "https://economia.awesomeapi.com.br/USD/";
    private final String urlEur = "https://economia.awesomeapi.com.br/EUR/";

    public EconomiaService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public CotacaoEconomiaDTO getCotacaoUsd(double valor){
        return this.restTemplate.getForObject(urlUsd+valor+"/json", CotacaoEconomiaDTO.class);
    }
    public CotacaoEconomiaDTO getCotacaoEur(double valor){
        return this.restTemplate.getForObject(urlEur+valor+"/json", CotacaoEconomiaDTO.class);
    }
}
