# Padrão de Projeto Singleton - Logger em Java

## Descrição

Este projeto tem como objetivo implementar o padrão de projeto Singleton em Java por meio de uma classe Logger.

A ideia é garantir que exista apenas uma única instância dessa classe durante toda a execução do programa, permitindo que diferentes partes do sistema utilizem o mesmo objeto para registrar mensagens.

---

## Objetivo

- Aplicar o padrão Singleton na prática
- Centralizar o registro de logs
- Evitar múltiplas instâncias da classe Logger

---

## Estrutura do Projeto

O projeto é composto por duas classes:

- Logger.java: responsável por implementar o padrão Singleton e armazenar os logs
- Main.java: responsável por simular o uso do Logger

---

## Funcionamento

A classe Logger foi construída de forma que não seja possível criar objetos diretamente com o uso de "new". Isso é feito através de um construtor privado.

A única forma de obter uma instância da classe é por meio do método estático getInstance(), que garante que sempre será retornado o mesmo objeto.

As mensagens são armazenadas em uma lista e podem ser exibidas ao final da execução.

---

## Métodos

getInstance()  
Retorna a única instância da classe Logger.

log(String mensagem)  
Adiciona uma mensagem à lista de logs.

exibirLogs()  
Exibe todas as mensagens registradas no console.

---

## Exemplo de uso

```java
Logger logger1 = Logger.getInstance();
logger1.log("Iniciando sistema");

Logger logger2 = Logger.getInstance();
logger2.log("Processando dados");

Logger logger3 = Logger.getInstance();
logger3.log("Finalizando sistema");

logger1.exibirLogs();# Padrão de Projeto Singleton - Logger em Java

## Descrição

Este projeto tem como objetivo implementar o padrão de projeto Singleton em Java por meio de uma classe Logger.

A ideia é garantir que exista apenas uma única instância dessa classe durante toda a execução do programa, permitindo que diferentes partes do sistema utilizem o mesmo objeto para registrar mensagens.

---

## Objetivo

- Aplicar o padrão Singleton na prática
- Centralizar o registro de logs
- Evitar múltiplas instâncias da classe Logger

---

## Estrutura do Projeto

O projeto é composto por duas classes:

- Logger.java: responsável por implementar o padrão Singleton e armazenar os logs
- Main.java: responsável por simular o uso do Logger

---

## Funcionamento

A classe Logger foi construída de forma que não seja possível criar objetos diretamente com o uso de "new". Isso é feito através de um construtor privado.

A única forma de obter uma instância da classe é por meio do método estático getInstance(), que garante que sempre será retornado o mesmo objeto.

As mensagens são armazenadas em uma lista e podem ser exibidas ao final da execução.

---

## Métodos

getInstance()  
Retorna a única instância da classe Logger.

log(String mensagem)  
Adiciona uma mensagem à lista de logs.

exibirLogs()  
Exibe todas as mensagens registradas no console.

---

## Exemplo de uso

```java
Logger logger1 = Logger.getInstance();
logger1.log("Iniciando sistema");

Logger logger2 = Logger.getInstance();
logger2.log("Processando dados");

Logger logger3 = Logger.getInstance();
logger3.log("Finalizando sistema");

logger1.exibirLogs();