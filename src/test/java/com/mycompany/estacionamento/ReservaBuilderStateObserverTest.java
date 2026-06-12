package com.mycompany.estacionamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Testes unitários dos padrões Builder, State e Observer aplicados à reserva.
 */
class ReservaBuilderStateObserverTest {

    @Test
    void deveCriarReservaComEstadoDefinidoPeloBuilder() {
        EstadoRes estado = new EstadoResStub();

        Reserva reserva = new ReservaBuilder()
                .definirEstado(estado)
                .build();

        assertSame(estado, reserva.getEstado());
    }

    @Test
    void deveLancarExcecaoAoCriarReservaSemEstadoNoBuilder() {
        ReservaBuilder builder = new ReservaBuilder();

        assertThrows(IllegalStateException.class, builder::build);
    }

    @Test
    void deveAlterarEstadoDaReserva() {
        Reserva reserva = new Reserva();
        EstadoRes estado = new ReservaConfirmada();

        reserva.setEstado(estado);

        assertSame(estado, reserva.getEstado());
    }

    @Test
    void deveNotificarObserverUsandoStub() {
        Reserva reserva = new Reserva();
        ObserverStub observer = new ObserverStub();

        reserva.addObserver(observer);
        reserva.notificar("Reserva confirmada");

        assertEquals("Reserva confirmada", observer.getUltimaMensagem());
    }

    @Test
    void deveNotificarDoisObserversUsandoMock() {
        Reserva reserva = new Reserva();
        NotificacaoObserver administrador = mock(NotificacaoObserver.class);
        NotificacaoObserver seguranca = mock(NotificacaoObserver.class);

        reserva.addObserver(administrador);
        reserva.addObserver(seguranca);
        reserva.notificar("Entrada liberada");

        verify(administrador, times(1)).atualizar("Entrada liberada");
        verify(seguranca, times(1)).atualizar("Entrada liberada");
    }

    /**
     * Stub simples para validar o recebimento da mensagem sem depender da classe real.
     */
    private static class ObserverStub implements NotificacaoObserver {
        private String ultimaMensagem;

        @Override
        public void atualizar(String mensagem) {
            this.ultimaMensagem = mensagem;
        }

        String getUltimaMensagem() {
            return ultimaMensagem;
        }
    }

    /**
     * Stub de estado para testar o Builder sem depender de um estado concreto específico.
     */
    private static class EstadoResStub implements EstadoRes {
        @Override
        public void iniciar() {
            // Stub usado apenas para teste.
        }

        @Override
        public void cancelar() {
            // Stub usado apenas para teste.
        }

        @Override
        public void confirmar() {
            // Stub usado apenas para teste.
        }

        @Override
        public void finalizar() {
            // Stub usado apenas para teste.
        }
    }
}
