package com.mycompany.estacionamento;

/**
 * Observador concreto que representa a equipe de segurança.
 */
public class SegurancaObserver implements NotificacaoObserver {

    /**
     * Recebe e exibe a notificação destinada à segurança.
     *
     * @param mensagem mensagem enviada pela reserva.
     */
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Segurança recebeu: " + mensagem);
    }
}
