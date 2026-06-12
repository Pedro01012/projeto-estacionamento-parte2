package com.mycompany.estacionamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Testes unitários do padrão Factory Method aplicado à criação de vagas.
 */
class EstacionamentoCreatorTest {

    @Test
    void deveCriarVagaVipQuandoTipoForVip() {
        EstacionamentoCreator creator = new EstacionamentoCreator();

        Vaga vaga = creator.criarVaga("VIP");

        assertInstanceOf(VagaVip.class, vaga);
    }

    @Test
    void deveCriarVagaEletricaQuandoTipoForEletrica() {
        EstacionamentoCreator creator = new EstacionamentoCreator();

        Vaga vaga = creator.criarVaga("ELETRICA");

        assertInstanceOf(VagaEletrica.class, vaga);
    }

    @Test
    void deveCriarVagaComumQuandoTipoForComum() {
        EstacionamentoCreator creator = new EstacionamentoCreator();

        Vaga vaga = creator.criarVaga("COMUM");

        assertInstanceOf(VagaComum.class, vaga);
    }

    @Test
    void deveRetornarVagaComumQuandoTipoForDesconhecido() {
        EstacionamentoCreator creator = new EstacionamentoCreator();

        Vaga vaga = creator.criarVaga("GRANDE_PORTE");

        assertInstanceOf(VagaComum.class, vaga);
    }

    @Test
    void deveLancarExcecaoQuandoTipoDeVagaForNulo() {
        EstacionamentoCreator creator = new EstacionamentoCreator();

        assertThrows(IllegalArgumentException.class, () -> creator.criarVaga(null));
    }
}
