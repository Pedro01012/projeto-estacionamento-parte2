package com.mycompany.estacionamento;

/**
 * Estado concreto que representa uma reserva cancelada.
 */
public class ReservaCancelada implements EstadoRes {

    /**
     * Informa que uma reserva cancelada não pode ser iniciada.
     */
    @Override
    public void iniciar() {
        System.out.println("Reserva cancelada não pode ser iniciada");
    }

    /**
     * Informa que a reserva já está cancelada.
     */
    @Override
    public void cancelar() {
        System.out.println("Reserva já está cancelada");
    }

    /**
     * Informa que uma reserva cancelada não pode ser confirmada.
     */
    @Override
    public void confirmar() {
        System.out.println("Reserva cancelada não pode ser confirmada");
    }

    /**
     * Informa que uma reserva cancelada não pode ser finalizada.
     */
    @Override
    public void finalizar() {
        System.out.println("Reserva cancelada não pode ser finalizada");
    }
}
