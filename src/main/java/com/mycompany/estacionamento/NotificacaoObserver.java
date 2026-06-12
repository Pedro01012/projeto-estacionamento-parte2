package com.mycompany.estacionamento;

/**
 * Interface observadora do padrão Observer.
 */
public interface NotificacaoObserver {

    /**
     * Recebe uma mensagem enviada pelo objeto observado.
     *
     * @param mensagem mensagem enviada pela reserva.
     */
    void atualizar(String mensagem);
}
