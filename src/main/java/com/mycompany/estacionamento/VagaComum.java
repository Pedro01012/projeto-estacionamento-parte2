package com.mycompany.estacionamento;

/**
 * Produto concreto que representa uma vaga comum.
 */
public class VagaComum implements Vaga {

    /**
     * Exibe a ação de ocupação de uma vaga comum.
     */
    @Override
    public void ocupar() {
        System.out.println("Vaga comum ocupada");
    }

    /**
     * Exibe a ação de liberação de uma vaga comum.
     */
    @Override
    public void desocupar() {
        System.out.println("Vaga comum liberada");
    }
}
