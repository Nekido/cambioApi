package br.com.cotacao;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EconomiaService {
    private RestTemplate restTemplate;
    private final String url = "https://economia.awesomeapi.com.br/";

    public EconomiaService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public CotacaoEconomiaDTO getCotacaoUsd(String tipoMoeda){
        return this.restTemplate.getForObject(url+tipoMoeda+"/json", CotacaoEconomiaDTO.class);
    }
}
