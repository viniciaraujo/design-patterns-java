# 🌳 Padrão de Projeto: Composite

## 📌 Sobre o projeto
Implementação do padrão de projeto **Composite** (Estrutural) em Java.
O Composite permite tratar objetos individuais e composições de objetos
de forma uniforme, através de uma interface comum.

## 💡 Contexto do exemplo
Uma empresa é composta por departamentos, e cada departamento por funcionários.
Tanto um `FuncionarioSimples` quanto um `Departamento` implementam a mesma
interface `Funcionario`, permitindo calcular o custo total da empresa
recursivamente de forma transparente.

## 🗂️ Estrutura
- `Funcionario` → interface comum para folhas e compostos
- `FuncionarioSimples` → objeto folha (sem filhos)
- `Departamentos` → objeto composto (contém outros funcionários)
- `Main` → demonstra o cálculo do custo total da empresa

## 🛠️ Tecnologias
- Java
- IntelliJ IDEA