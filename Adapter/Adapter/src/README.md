# 🔌 Padrão de Projeto: Adapter

## 📌 Sobre o projeto
Implementação do padrão de projeto **Adapter** (Estrutural) em Java.
O Adapter permite que interfaces incompatíveis trabalhem juntas, funcionando
como um tradutor entre duas classes que não se comunicariam diretamente.

## 💡 Contexto do exemplo
Um `Notebook` moderno só aceita `TomadaNova`, mas só temos uma `TomadaAntiga`
disponível. O `AdaptadorTomada` resolve isso traduzindo a interface antiga
para a nova, sem modificar nenhuma das duas classes originais.

## 🗂️ Estrutura
- `TomadaNova` → interface esperada pelo cliente
- `TomadaAntiga` → classe existente incompatível
- `AdaptadorTomada` → o adaptador que faz a ponte entre as duas
- `Notebook` → cliente que usa a interface nova

## 🛠️ Tecnologias
- Java
- IntelliJ IDEA