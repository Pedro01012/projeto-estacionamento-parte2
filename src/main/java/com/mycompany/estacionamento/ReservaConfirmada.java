package com.mycompany.estacionamento;

/**
 * Estado concreto que representa uma reserva confirmada.
 */
public class ReservaConfirmada implements EstadoRes {

    /**
     * Informa que a reserva confirmada foi iniciada.
     */
    @Override
    public void iniciar() {
        System.out.println("Reserva confirmada iniciada");
    }

    /**
     * Informa que a reserva confirmada foi cancelada.
     */
    @Override
    public void cancelar() {
        System.out.println("Reserva confirmada cancelada");
    }

    /**
     * Informa que a reserva já está confirmada.
     */
    @Override
    public void confirmar() {
        System.out.println("Reserva já está confirmada");
    }

    /**
     * Informa que a reserva confirmada foi finalizada.
     */
    @Override
    public void finalizar() {
        System.out.println("Reserva confirmada finalizada");
    }
}
