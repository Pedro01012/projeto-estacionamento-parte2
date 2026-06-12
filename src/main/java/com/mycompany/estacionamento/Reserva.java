package com.mycompany.estacionamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Classe responsável por representar uma reserva de vaga.
 *
 * Controla informações relacionadas ao processo de reserva
 * dentro do sistema de estacionamento.
 *
 * @author Maria Eduarda Wang
 */
public class Reserva {

    private EstadoRes estado;
    private final List<NotificacaoObserver> observers = new ArrayList<>();

    /**
     * Define o estado atual da reserva.
     *
     * @param estado novo estado da reserva.
     * @throws IllegalArgumentException quando o estado é nulo.
     */
    public void setEstado(EstadoRes estado) {
        if (estado == null) {
            throw new IllegalArgumentException("O estado da reserva é obrigatório.");
        }
        this.estado = estado;
    }

    /**
     * Retorna o estado atual da reserva.
     *
     * @return estado atual.
     */
    public EstadoRes getEstado() {
        return estado;
    }

    /**
     * Adiciona um observador que será notificado por esta reserva.
     *
     * @param observer observador a ser adicionado.
     * @throws IllegalArgumentException quando o observador é nulo.
     */
    public void addObserver(NotificacaoObserver observer) {
        if (observer == null) {
            throw new IllegalArgumentException("O observador é obrigatório.");
        }
        observers.add(observer);
    }

    /**
     * Retorna a lista de observadores cadastrados apenas para consulta.
     *
     * @return lista imutável de observadores.
     */
    public List<NotificacaoObserver> getObservers() {
        return Collections.unmodifiableList(observers);
    }

    /**
     * Notifica todos os observadores cadastrados.
     *
     * @param mensagem mensagem a ser enviada.
     * @throws IllegalArgumentException quando a mensagem é nula ou vazia.
     */
    public void notificar(String mensagem) {
        if (mensagem == null || mensagem.isBlank()) {
            throw new IllegalArgumentException("A mensagem de notificação é obrigatória.");
        }
        for (NotificacaoObserver observer : observers) {
            observer.atualizar(mensagem);
        }
    }
}
