package com.mycompany.estacionamento;

/**
 * Estado concreto que representa uma reserva em uso.
 */
public class ReservaEmUso implements EstadoRes {

    /**
     * Informa que a reserva já está em uso.
     */
    @Override
    public void iniciar() {
        System.out.println("Reserva já está em uso");
    }

    /**
     * Informa que uma reserva em uso não deve ser cancelada no protótipo.
     */
    @Override
    public void cancelar() {
        System.out.println("Reserva em uso não pode ser cancelada");
    }

    /**
     * Informa que a reserva em uso já foi confirmada anteriormente.
     */
    @Override
    public void confirmar() {
        System.out.println("Reserva em uso já foi confirmada");
    }

    /**
     * Informa que a reserva em uso foi finalizada.
     */
    @Override
    public void finalizar() {
        System.out.println("Reserva em uso finalizada");
    }
}
