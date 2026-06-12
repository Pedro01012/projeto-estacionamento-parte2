package com.mycompany.estacionamento;

/**
 * Interface do padrão State que define as ações possíveis no ciclo de vida da reserva.
 */
public interface EstadoRes {

    /**
     * Inicia o uso da reserva.
     */
    void iniciar();

    /**
     * Cancela a reserva.
     */
    void cancelar();

    /**
     * Confirma a reserva.
     */
    void confirmar();

    /**
     * Finaliza a reserva.
     */
    void finalizar();
}
