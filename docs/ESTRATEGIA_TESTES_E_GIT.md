# Estratégia de Testes e Versionamento

## Estratégia de testes

A estratégia de testes foi organizada para atender ao pedido da Parte 2 do projeto, contemplando 15 casos de teste estruturados e 15 testes unitários com JUnit. Os testes cobrem cenários válidos, alternativos e de exceção.

Os testes foram distribuídos da seguinte forma:

- `EstacionamentoCreatorTest`: valida o padrão Factory Method na criação de vagas.
- `PagamentoAdapterTest`: valida o padrão Adapter no processamento de pagamentos.
- `ReservaBuilderStateObserverTest`: valida Builder, State e Observer.

Também foram usados stubs e mocks:

- Stub: `ObserverStub`, usado para simular um observador e guardar a mensagem recebida.
- Stub: `EstadoResStub`, usado para simular um estado da reserva sem depender de um estado concreto.
- Mock: `NotificacaoObserver`, usando Mockito para verificar chamadas dinâmicas de notificação.

## Estratégia de branches sugerida

A branch principal deve ser a `main`. O grupo pode criar uma branch de integração chamada `develop` e, a partir dela, cada integrante deve criar sua própria branch:

```text
main
develop
diagrama-joao
documento-henrique
codigo-duda
testes-pedro
```

## Padrão de commits sugerido

Usar commits pequenos e com mensagens padronizadas:

```text
feat: nova funcionalidade ou implementação
fix: correção de erro
docs: documentação
test: testes unitários ou casos de teste
refactor: melhoria interna sem mudar comportamento
chore: configuração ou organização do projeto
```

Exemplos:

```bash
git commit -m "docs: adiciona casos de teste estruturados"
git commit -m "test: adiciona testes unitários do Factory Method"
git commit -m "test: adiciona testes unitários do Observer"
git commit -m "chore: configura JUnit e Mockito no pom"
git commit -m "docs: adiciona instruções de versionamento"
```

## Fluxo recomendado para o grupo

1. Clonar o repositório.
2. Entrar na branch `develop`.
3. Criar uma branch própria para a parte de cada integrante.
4. Fazer alterações pequenas.
5. Rodar os testes.
6. Fazer commits incrementais.
7. Enviar a branch para o GitHub.
8. Abrir Pull Request para `develop`.
9. Fazer merge após o grupo revisar.

## Comandos básicos

```bash
git clone LINK_DO_REPOSITORIO
cd NOME_DA_PASTA

git checkout -b develop
git push -u origin develop

git checkout develop
git pull origin develop
git checkout -b testes-pedro

git add .
git commit -m "test: adiciona testes unitários do projeto"
git push -u origin testes-pedro
```

Depois disso, abrir Pull Request no GitHub.

## Observação importante

Os commits não devem ficar concentrados em uma única pessoa. Cada integrante precisa subir sua parte usando a própria conta do GitHub para aparecer no histórico do projeto.
