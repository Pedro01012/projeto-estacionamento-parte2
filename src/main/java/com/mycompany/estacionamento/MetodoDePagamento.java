package com.mycompany.estacionamento;

/**
 * Interface alvo do padrão Adapter para padronizar formas de pagamento.
 */
public interface MetodoDePagamento {

    /**
     * Processa o pagamento de acordo com a implementação utilizada.
     *
     * @param valor valor a ser pago.
     * @return verdadeiro quando o pagamento é aceito no protótipo.
     */
    boolean processarPagamento(double valor);
}
