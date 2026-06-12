package com.mycompany.estacionamento;

/**
 * Interface criadora do padrão Factory Method.
 */
public interface VagaCreator {

    /**
     * Cria uma vaga conforme o tipo informado.
     *
     * @param tipo tipo da vaga desejada.
     * @return instância concreta de {@link Vaga}.
     */
    Vaga criarVaga(String tipo);
}
