# Padrão Builder - Montagem de Computadores

## Descrição
Este projeto implementa o padrão de projeto Builder para a criação de objetos do tipo Computador.

O padrão Builder permite construir objetos complexos passo a passo, facilitando a criação de diferentes configurações sem a necessidade de múltiplos construtores.

## Estrutura
- Computador: objeto final
- ComputadorBuilder: interface de construção
- ComputadorBuilderImpl: implementação do builder
- Main: classe de teste

## Funcionalidades
- Criação de computador para escritório
- Criação de computador gamer
- Criação de computador para desenvolvimento

## Exemplo
```java
Computador pc = new ComputadorBuilderImpl()
    .comProcessador("Intel i5")
    .comMemoriaRAM(16)
    .build();