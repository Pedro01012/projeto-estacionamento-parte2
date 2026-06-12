package com.mycompany.estacionamento;

/**
 * Estado concreto que representa uma reserva pendente.
 */
public class ReservaPendente implements EstadoRes {

    /**
     * Informa que a reserva pendente foi iniciada.
     */
    @Override
    public void iniciar() {
        System.out.println("Reserva pendente iniciada");
    }

    /**
     * Informa que a reserva pendente foi cancelada.
     */
    @Override
    public void cancelar() {
        System.out.println("Reserva pendente cancelada");
    }

    /**
     * Informa que a reserva pendente foi confirmada.
     */
    @Override
    public void confirmar() {
        System.out.println("Reserva pendente confirmada");
    }

    /**
     * Informa que a reserva pendente foi finalizada.
     */
    @Override
    public void finalizar() {
        System.out.println("Reserva pendente finalizada");
    }
}
