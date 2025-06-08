# Identificar Bandeira de Cartão de Crédito

Este projeto tem como objetivo criar uma API em Java para identificar a bandeira de um cartão de crédito. O ambiente local será configurado utilizando Docker.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto.
- **Spring Boot**: Framework para desenvolvimento da API.
- **Docker**: Ferramenta para containerização do ambiente local.
- **Maven**: Gerenciador de dependências e build.

## Funcionalidades

- Identificar a bandeira de um cartão de crédito com base no número informado.
- Retornar informações sobre a bandeira identificada.

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas:

- [Docker](https://www.docker.com/)
- [Java 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/)

## Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/rogernobre/identificarBandeiraCartaoCredito.git
cd identificarBandeiraCartaoCredito
```

2. Compile o projeto utilizando Maven:

```bash
mvn clean install
```

3. Construa a imagem Docker:

```bash
docker build -t identificar-bandeira-cartao-credito .
```

4. Execute o container Docker:

```bash
docker run -p 8080:8080 identificar-bandeira-cartao-credito
```

5. Acesse a API em `http://localhost:8080`.

## Estrutura do Projeto

- `src/main/java`: Código fonte da aplicação.
- `src/main/resources`: Arquivos de configuração.
- `Dockerfile`: Configuração para criar a imagem Docker.
- `pom.xml`: Configuração do Maven.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
