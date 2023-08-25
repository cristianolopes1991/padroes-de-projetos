package br.com.rinaldodev.strategy;

import java.math.BigDecimal;

public class Strategy {

    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("100");
        Compra compra = new Compra(valor);

        compra.processaCompra(new PagamentoCartaoCredito());
//        compra.processaCompra(new PagamentoCartaoDebito());
    }
}
