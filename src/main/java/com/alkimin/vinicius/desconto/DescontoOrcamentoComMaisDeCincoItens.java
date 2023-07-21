package com.alkimin.vinicius.desconto;

import com.alkimin.vinicius.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;



public class DescontoOrcamentoComMaisDeCincoItens extends Desconto {

    public DescontoOrcamentoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}