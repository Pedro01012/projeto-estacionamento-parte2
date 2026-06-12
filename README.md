# Projeto Estacionamento - Parte 2

Protótipo Java do sistema de gerenciamento de estacionamento e reservas.

## O que foi ajustado

- Padronização dos pacotes Java em `com.mycompany.estacionamento`.
- Configuração do `pom.xml` com JUnit 5, Mockito e plugin de JavaDoc.
- Implementação de validações simples para cenários de exceção.
- Criação de estados concretos da reserva para o padrão State.
- Criação de 15 testes unitários em JUnit.
- Inclusão de stubs e mocks nos testes.
- Geração de documentação JavaDoc em `docs/javadoc`.
- Criação de documentação da estratégia de testes e versionamento.

## Como rodar os testes

No terminal, dentro da pasta do projeto, execute:

```bash
mvn test
```

## Como gerar o JavaDoc novamente

```bash
mvn javadoc:javadoc
```

A documentação gerada pelo Maven ficará em:

```text
target/site/apidocs/index.html
```

Também foi incluída uma documentação JavaDoc pronta em:

```text
docs/javadoc/index.html
```

## Organização principal

```text
src/main/java/com/mycompany/estacionamento  -> código do protótipo
src/test/java/com/mycompany/estacionamento  -> testes unitários JUnit
docs                                      -> documentação complementar
```
