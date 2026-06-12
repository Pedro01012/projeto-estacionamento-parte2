package com.mycompany.estacionamento;

import java.util.Locale;

/**
 * Adaptador que permite usar diferentes meios de pagamento por meio da
 * interface comum {@link MetodoDePagamento}.
 */
public class PagamentoAdapter implements MetodoDePagamento {

    private final String tipo;

    /**
     * Cria o adaptador de pagamento.
     *
     * @param tipo tipo do pagamento: PIX, CARTAO ou DINHEIRO.
     * @throws IllegalArgumentException quando o tipo é nulo, vazio ou inválido.
     */
    public PagamentoAdapter(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("O tipo de pagamento é obrigatório.");
        }

        String tipoNormalizado = tipo.trim().toUpperCase(Locale.ROOT);
        if (!tipoNormalizado.equals("PIX")
                && !tipoNormalizado.equals("CARTAO")
                && !tipoNormalizado.equals("CARTÃO")
                && !tipoNormalizado.equals("DINHEIRO")) {
            throw new IllegalArgumentException("Tipo de pagamento inválido: " + tipo);
        }

        this.tipo = tipoNormalizado;
    }

    /**
     * Processa o pagamento com validação simples de valor.
     *
     * @param valor valor a ser pago. Deve ser maior que zero.
     * @return verdadeiro quando o pagamento é processado no protótipo.
     * @throws IllegalArgumentException quando o valor é menor ou igual a zero.
     */
    @Override
    public boolean processarPagamento(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do pagamento deve ser maior que zero.");
        }

        switch (tipo) {
            case "PIX" -> new Pix().pagarPix(valor);
            case "CARTAO", "CARTÃO" -> new Cartao().pagarCartao(valor);
            case "DINHEIRO" -> new Dinheiro().pagarDinheiro(valor);
            default -> throw new IllegalStateException("Tipo de pagamento não mapeado: " + tipo);
        }

        return true;
    }
}
