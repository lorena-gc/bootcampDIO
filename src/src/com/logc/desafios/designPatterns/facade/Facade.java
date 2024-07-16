package com.logc.desafios.designPatterns.facade;

import com.logc.desafios.subsistema1.crm.CrmService;
import com.logc.desafios.subsistema2.cep.CepApi;

public class Facade {
    public void migrarClient(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
