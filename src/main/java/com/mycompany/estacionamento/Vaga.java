package com.mycompany.estacionamento;

/**
 * Interface produto utilizada pelo padrão Factory Method.
 * Representa uma vaga genérica do estacionamento.
 */
public interface Vaga {

    /**
     * Marca a vaga como ocupada.
     */
    void ocupar();

    /**
     * Marca a vaga como desocupada/liberada.
     */
    void desocupar();
}
