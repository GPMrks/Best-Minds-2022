# Programa Best Minds 2022

## Sistema de Criação de Usuário para Oliveira Trade

___

### Ferramentas Utilizadas

* Java 19
* Spring Boot 2.7.6
* Spring Data JPA w/ H2DB
* Spring Security
* Maven
* SpringDoc OpenAPI para documentação

___

### Rodando a API

Clonar o repositorio para a maquina local

```
git clone git@github.com:GPMrks/Best-Minds-2022.git
```

Dentro da pasta do projeto subir a API utilizando Spring-boot com Maven

```
mvn spring-boot:run
```

Acessar a documentação da API pelo localhost

```
http://localhost:8080/swagger-ui/index.html
```

Através do Swagger é possivel fazer todo o teste da API, sendo a criação do usuário e também o seu login (ou erro de login)

Conforme segue:

# Criação do Usuário

- Clicar em "Try it out"

- Preencher o JSON com os dados (Nome, sobrenome, username, senha)

Exemplo:
```
{
  "firstName": "John",
  "lastName": "Doe",
  "username": "JDoe",
  "password": "Doe123"
}
```

- Clicar em "Execute"

- Status 201 representando a criação bem sucedida do usuário contendo a mensagem.

![alt text](/src/main/resources/static/1.png)

![alt text](/src/main/resources/static/2.png)

# Login do Usuário

- Clicar em "Try it out"

- Preencher o JSON com os dados (Username, senha)

Exemplo:
```
{
  "username": "JDoe",
  "password": "Doe123"
}
```

- Clicar em "Execute"

- Status 200 representando a sucesso ao logar contendo o nome de usuário e a mensagem.

![alt text](/src/main/resources/static/3.png)

![alt text](/src/main/resources/static/4.png)
