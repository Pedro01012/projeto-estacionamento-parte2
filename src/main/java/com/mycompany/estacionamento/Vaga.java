package com.mycompany.estacionamento;

/**
 * Classe responsável por representar uma vaga do estacionamento.
 *
 * Define informações e características das vagas disponíveis.
 *
 * @author Maria Eduarda Wang
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
