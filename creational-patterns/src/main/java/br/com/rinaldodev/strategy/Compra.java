package br.com.rinaldodev.strategy;

import java.math.BigDecimal;

//Contexto
public class Compra {

    BigDecimal valor;

    public Compra(BigDecimal valor) {
        this.valor = valor;
    }

    void processaCompra(EstrategiaPagamento estrategiaPagamento) {
        estrategiaPagamento.pagar(valor);
    }
}
