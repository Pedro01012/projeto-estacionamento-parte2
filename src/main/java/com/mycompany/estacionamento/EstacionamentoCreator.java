package com.mycompany.estacionamento;

import java.util.Locale;

/**
 * Criador concreto do padrão Factory Method para criação de vagas.
 */
public class EstacionamentoCreator implements VagaCreator {

    /**
     * Cria uma vaga VIP, elétrica ou comum a partir do texto informado.
     * Tipos desconhecidos são tratados como vaga comum para manter o protótipo simples.
     *
     * @param tipo tipo da vaga: VIP, ELETRICA ou COMUM.
     * @return vaga concreta criada.
     * @throws IllegalArgumentException quando o tipo é nulo ou vazio.
     */
    @Override
    public Vaga criarVaga(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("O tipo da vaga é obrigatório.");
        }

        String tipoNormalizado = tipo.trim().toUpperCase(Locale.ROOT);

        return switch (tipoNormalizado) {
            case "VIP" -> new VagaVip();
            case "ELETRICA", "ELÉTRICA" -> new VagaEletrica();
            case "COMUM" -> new VagaComum();
            default -> new VagaComum();
        };
    }
}
