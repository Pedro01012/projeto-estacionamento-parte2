package com.mycompany.estacionamento;

/**
 * Builder responsável pela criação controlada de objetos {@link Reserva}.
 */
public class ReservaBuilder {

    private final Reserva reserva = new Reserva();

    /**
     * Define o estado inicial da reserva em construção.
     *
     * @param estado estado inicial da reserva.
     * @return o próprio builder para permitir chamadas encadeadas.
     */
    public ReservaBuilder definirEstado(EstadoRes estado) {
        reserva.setEstado(estado);
        return this;
    }

    /**
     * Finaliza a construção da reserva.
     *
     * @return reserva pronta para uso.
     * @throws IllegalStateException quando a reserva ainda não possui estado.
     */
    public Reserva build() {
        if (reserva.getEstado() == null) {
            throw new IllegalStateException("A reserva precisa ter um estado antes de ser criada.");
        }
        return reserva;
    }
}
