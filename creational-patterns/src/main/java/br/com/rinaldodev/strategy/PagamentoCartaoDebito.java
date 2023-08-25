package br.com.rinaldodev.strategy;

import java.math.BigDecimal;

public class PagamentoCartaoDebito implements EstrategiaPagamento{
    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pagamento realizado com cartão de débito " + valor);
    }
}
