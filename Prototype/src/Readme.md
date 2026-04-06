
---

# 📄 README — Prototype

```markdown
# Padrão Prototype - Sistema de Documentos

## Descrição
Este projeto utiliza o padrão Prototype para permitir a clonagem de documentos institucionais.

A ideia é criar um modelo base e gerar novas cópias com pequenas modificações, evitando recriar objetos do zero.

## Estrutura
- Prototype: interface com método clone()
- Documento: classe principal
- MainPrototype: classe de teste

## Funcionalidades
- Criação de documento modelo
- Clonagem de documentos
- Alteração de dados nas cópias
- Manutenção do objeto original intacto

## Exemplo
```java
Documento copia = modelo.clone();
copia.setPrioridade("Urgente");