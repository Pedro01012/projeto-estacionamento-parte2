package com.mycompany.estacionamento;

/**
 * Produto concreto que representa uma vaga VIP.
 */
public class VagaVip implements Vaga {

    /**
     * Exibe a ação de ocupação de uma vaga VIP.
     */
    @Override
    public void ocupar() {
        System.out.println("Vaga VIP ocupada");
    }

    /**
     * Exibe a ação de liberação de uma vaga VIP.
     */
    @Override
    public void desocupar() {
        System.out.println("Vaga VIP liberada");
    }
}
