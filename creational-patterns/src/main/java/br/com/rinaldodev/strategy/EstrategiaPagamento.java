package br.com.rinaldodev.strategy;

import java.math.BigDecimal;

public interface EstrategiaPagamento {

    void pagar(BigDecimal valor);
}
