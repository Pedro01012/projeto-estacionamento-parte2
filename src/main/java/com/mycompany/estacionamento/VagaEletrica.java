package com.mycompany.estacionamento;

/**
 * Produto concreto que representa uma vaga para veículo elétrico.
 */
public class VagaEletrica implements Vaga {

    /**
     * Exibe a ação de ocupação de uma vaga elétrica.
     */
    @Override
    public void ocupar() {
        System.out.println("Vaga elétrica ocupada");
    }

    /**
     * Exibe a ação de liberação de uma vaga elétrica.
     */
    @Override
    public void desocupar() {
        System.out.println("Vaga elétrica liberada");
    }
}
