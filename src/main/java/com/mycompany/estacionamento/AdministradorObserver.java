package com.mycompany.estacionamento;

/**
 * Observador concreto que representa o administrador do estacionamento.
 */
public class AdministradorObserver implements NotificacaoObserver {

    /**
     * Recebe e exibe a notificação destinada ao administrador.
     *
     * @param mensagem mensagem enviada pela reserva.
     */
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Administrador recebeu: " + mensagem);
    }
}
