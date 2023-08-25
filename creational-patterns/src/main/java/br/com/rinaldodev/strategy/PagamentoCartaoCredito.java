package br.com.rinaldodev.strategy;

import java.math.BigDecimal;

public class PagamentoCartaoCredito implements EstrategiaPagamento{
    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pagou no crédito" + valor);
    }
}
