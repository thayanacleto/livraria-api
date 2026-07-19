# Livros API

REST API para gerenciamento de Livros, desenvolvida com Java e Spring Boot.

## Tecnologias
- Java 25
- Spring Boot 3.5.16
- Spring Data JPA
- PostgreSQL
- Maven

## Funcionalidades
- Cadastrar produto
- Listar Livros
- Atualizar produto
- Deletar produto

## Como rodar

### Pré-requisitos
- Java 17+
- PostgreSQL
- Maven

### Configuração
1. Crie um banco de dados chamado `Livros_db` no PostgreSQL
2. Configure as credenciais no `application.properties`
3. Execute:

```bash
./mvnw spring-boot:run
```

## Endpoints

| Método | URL | Descrição |
|--------|-----|-----------|
| GET | /Livros | Lista todos os Livros |
| POST | /Livros | Cadastra um produto |
| PUT | /Livros/{id} | Atualiza um produto |
| DELETE | /Livros/{id} | Remove um produto |

## Autora
Thaynara Anacleto — [GitHub](https://github.com/thayanacleto)
