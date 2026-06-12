package com.mycompany.estacionamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testes unitários do padrão Adapter aplicado aos meios de pagamento.
 */
class PagamentoAdapterTest {

    @Test
    void deveProcessarPagamentoPixComValorValido() {
        MetodoDePagamento pagamento = new PagamentoAdapter("PIX");

        boolean resultado = pagamento.processarPagamento(50.0);

        assertTrue(resultado);
    }

    @Test
    void deveProcessarPagamentoCartaoComValorValido() {
        MetodoDePagamento pagamento = new PagamentoAdapter("CARTAO");

        boolean resultado = pagamento.processarPagamento(80.0);

        assertTrue(resultado);
    }

    @Test
    void deveProcessarPagamentoDinheiroComValorValido() {
        MetodoDePagamento pagamento = new PagamentoAdapter("DINHEIRO");

        boolean resultado = pagamento.processarPagamento(30.0);

        assertTrue(resultado);
    }

    @Test
    void deveLancarExcecaoQuandoValorPagamentoForZero() {
        MetodoDePagamento pagamento = new PagamentoAdapter("PIX");

        assertThrows(IllegalArgumentException.class, () -> pagamento.processarPagamento(0));
    }

    @Test
    void deveLancarExcecaoQuandoTipoPagamentoForInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new PagamentoAdapter("BOLETO"));
    }
}
