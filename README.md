# BankSystem

Sistema bancário em desenvolvimento com foco em simular operações reais de contas e usuários, utilizando arquitetura em camadas e boas práticas de backend

---

## Status

Em desenvolvimento, mas entidades modeladas e camada de persistência em andamento

---

## Arquitetura

O projeto segue o padrão de arquitetura em camadas:

* Controller - responsável pelos endpoints da API
* Service - regras de negócio
* Repository - acesso aos dados
* Model - entidades do sistema

Separação pensada para manter o código organizado, escalável e de fácil manutenção

---

## Tecnologias

* Java 21
* Spring Boot
* Maven
* JPA / Hibernate
* H2 Database (desenvolvimento)
* PostgreSQL (planejado para produção)

---

## Estrutura do Projeto

src/main/java/com/rayra/BankSystem
* controller
* service
* repository
* model

---

## Objetivo

Projeto criado com foco em prática de desenvolvimento backend, aplicando conceitos como:

* Arquitetura limpa
* Separação de responsabilidades
* Construção de APIs REST
* Modelagem de dados

---

## Funcionalidades

### Em desenvolvimento

* Cadastro de usuários
* Criação de contas bancárias

### Planejadas

* Depósito e saque
* Transferências entre contas
* Autenticação de usuário com JWT

---

## Como executar

### Pré-requisitos

* Java 21+
* Maven instalado

---

### Passos

git clone https://github.com/juliarayra/BankSystem.git
cd BankSystem
mvn spring-boot:run

A aplicação estará disponível em:
http://localhost:8080

---

## Banco de Dados

O projeto utiliza H2 Database em memória durante o desenvolvimento para agilizar testes

Planejado:

* Migração para PostgreSQL em ambiente de produção

---

## Próximos passos

* Implementar autenticação com JWT
* Adicionar validações de negócio
* Criar testes unitários
* Documentar API com Swagger
* Implementar tratamento global de exceções

---

## Sobre o projeto

Projeto desenvolvido para fins de estudo e evolução prática em backend
