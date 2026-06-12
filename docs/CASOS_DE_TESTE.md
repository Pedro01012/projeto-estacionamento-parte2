# Casos de Teste - Projeto Estacionamento

| Nº | Caso de teste | Tipo de cenário | Entrada / ação | Resultado esperado |
|---:|---|---|---|---|
| CT01 | Criar vaga VIP | Válido | `criarVaga("VIP")` | Retornar uma instância de `VagaVip`. |
| CT02 | Criar vaga elétrica | Válido | `criarVaga("ELETRICA")` | Retornar uma instância de `VagaEletrica`. |
| CT03 | Criar vaga comum | Válido | `criarVaga("COMUM")` | Retornar uma instância de `VagaComum`. |
| CT04 | Criar vaga com tipo desconhecido | Alternativo | `criarVaga("GRANDE_PORTE")` | Retornar `VagaComum` como comportamento padrão do protótipo. |
| CT05 | Criar vaga com tipo nulo | Exceção | `criarVaga(null)` | Lançar `IllegalArgumentException`. |
| CT06 | Processar pagamento Pix | Válido | `new PagamentoAdapter("PIX").processarPagamento(50.0)` | Retornar `true`. |
| CT07 | Processar pagamento Cartão | Válido | `new PagamentoAdapter("CARTAO").processarPagamento(80.0)` | Retornar `true`. |
| CT08 | Processar pagamento Dinheiro | Alternativo | `new PagamentoAdapter("DINHEIRO").processarPagamento(30.0)` | Retornar `true`. |
| CT09 | Processar pagamento com valor zero | Exceção | `processarPagamento(0)` | Lançar `IllegalArgumentException`. |
| CT10 | Criar pagamento com tipo inválido | Exceção | `new PagamentoAdapter("BOLETO")` | Lançar `IllegalArgumentException`. |
| CT11 | Criar reserva com Builder | Válido | Builder com estado definido | Criar reserva com o estado informado. |
| CT12 | Criar reserva sem estado no Builder | Exceção | `new ReservaBuilder().build()` | Lançar `IllegalStateException`. |
| CT13 | Alterar estado da reserva | Válido | `setEstado(new ReservaConfirmada())` | O estado atual deve ser `ReservaConfirmada`. |
| CT14 | Notificar observer usando stub | Válido | Adicionar `ObserverStub` e chamar `notificar(...)` | O stub deve receber a mensagem enviada. |
| CT15 | Notificar dois observers usando mock | Válido/extra | Dois mocks de `NotificacaoObserver` | Ambos devem receber a mensagem exatamente uma vez. |
